from datetime import datetime
from selenium import webdriver
import requests
import time
import json
import csv

date = datetime.now().strftime("%Y-%m-%d-%H")


def getRowsAndCookies():
    options = webdriver.ChromeOptions()
    options.add_experimental_option("excludeSwitches", ["enable-logging"])
    options.add_argument("--headless")
    driver = webdriver.Chrome(options=options)
    driver.get("https://rent.591.com.tw/?region=17")

    totalRows = 0

    while True:
        try:
            RowVaule = driver.find_element_by_xpath(
                "/html/body/div[2]/div/div[3]/div/section[2]/div/div/span"
            ).text
            totalRows = int(RowVaule.replace(",", ""))
            break
        except:
            print("waiting for page load")
            time.sleep(1)

    js = "let action = document.documentElement.scrollTop=100000"
    driver.execute_script(js)

    cookies = driver.get_cookies()
    cookies_session = cookies[14]["value"]
    cookies_xsrf_token = cookies[0]["value"]
    csrf_token = driver.find_element_by_xpath("/html/head/meta[12]").get_attribute(
        "content"
    )

    driver.close()
    driver.quit()

    with open("cookies.json", "w", encoding="utf8") as setjson:
        jdata = {
            "cookies_session": cookies_session,
            "cookies_xsrf_token": cookies_xsrf_token,
            "csrf_token": csrf_token,
        }
        json.dump(jdata, setjson, indent=4)

    return totalRows


def crawler(firstRow, totalRows, firstTime):
    with open("cookies.json", "r", encoding="utf8") as getjson:
        jdata = json.load(getjson)
        cookies_session = jdata["cookies_session"]
        cookies_xsrf_token = jdata["cookies_xsrf_token"]
        x_csrf_token = jdata["csrf_token"]

    payload = {
        "is_format_data": "1",
        "is_new_list": "1",
        "type": "1",
        "region": "17",
        "firstRow": firstRow,
        "totalRows": totalRows,
    }

    url = "https://rent.591.com.tw/home/search/rsList"

    headers = {
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36",
        "x-csrf-token": x_csrf_token,
    }

    cookies = {
        "XSRF-TOKEN": cookies_xsrf_token,
        "591_new_session": cookies_session,
        "urlJumpIp": "17",  # 影響地區的選項 591的地區編號
    }

    response = requests.get(url, payload, headers=headers, cookies=cookies)

    if response.status_code == requests.codes.ok:
        data = json.loads(response.text)
        reslist = data["data"]
        rentData = reslist["data"]
        labels = [i[0] for i in rentData[0].items()]

        try:
            with open(
                f"rentData{date}.csv", "a", newline="", encoding="utf-8-sig"
            ) as f:
                writer = csv.DictWriter(f, fieldnames=labels)
                if firstTime:
                    writer.writeheader()
                for elem in rentData:
                    writer.writerow(elem)
        except IOError:
            print("I/O error")
    else:
        print(response.status_code)


if __name__ == "__main__":
    start_time = time.time()

    totalRows = getRowsAndCookies()

    for i in range(0, totalRows, 30):
        percent = lambda x: int(x / totalRows * 100)
        print(f"目前進度{percent(i)}%")
        crawler(i, totalRows, i == 0)
    end_time = time.time()
    print(f"共花了{end_time - start_time}秒 完成資料輸出 名稱為rentData{date}.csv")
