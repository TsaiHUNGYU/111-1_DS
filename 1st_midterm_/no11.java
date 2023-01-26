/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1st_midterm;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class no11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("輸入月及日為 :(EX:08 20)");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] ss = date.split("\\s+");
        // System.out.println(Arrays.toString(ss));
        int month = Integer.parseInt(ss[0]);
        int day = Integer.parseInt(ss[1]);
        String constellation = "";
        switch (month) {
            case 1:
                constellation = day<21?"摩羯座":"水瓶座";
                break;
            case 2:
                constellation = day<20? "水瓶座":"雙魚座";
                break;
            case 3:
                constellation = day<21?"雙魚座":"白羊座";
                break;
            case 4:
                constellation = day<21?"白羊座":"金牛座";
                break;
            case 5:
                constellation = day<22?"金牛座":"雙子座";
                break;
            case 6:
                constellation = day<22?"雙子座":"巨蟹座";
                break;
            case 7:
                constellation = day<23?"巨蟹座":"獅子座";
                break;
            case 8:
                constellation = day<24?"獅子座":"處女座";
                break;
            case 9:
                constellation = day<24?"處女座":"天秤座";
                break;
            case 10:
                constellation = day<24?"天秤座":"天蠍座";
                break;
            case 11:
                constellation = day<23?"天蠍座":"射手座";
                break;
            case 12:
                constellation = day<22?"射手座":"摩羯座";
                break;
        }
        System.out.println("您的星座是：" +constellation);
        scanner.close();
    }
    
}
