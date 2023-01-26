/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1st_midterm;

import java.util.Arrays;
/**
 *
 * @author User
 */
import java.util.Scanner;
public class no21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // data        
        String[][][] account = 
        {
            {
                {"123", "456", "9000"}, {"456", "789", "5000"}, {"789", "888", "6000"}
            },
            {
                {"336", "558", "10000"}, {"775", "666", "12000"}, {"566", "221", "7000"}
            }
        };

        //查詢
        byte times;
        String[] iString ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入查詢組數為 :");
        times = scanner.nextByte();
        for(byte i = 0;i < times;i++)
        {
            System.out.println("請輸入帳號密碼 :(EX:123 999)");
            Scanner sc2 = new Scanner(System.in);
            iString = sc2.nextLine().split(" ");
            byte tmp = 0;
            for(int j = 0;j < account.length;j++)
            {        
                for(int z = 0;z < account.length;z++)
                {
                    if(iString[0].equals(account[j][z][0]))
                    {
                        if(iString[1].equals(account[j][z][1]))
                        {
                            System.out.println("餘額為 :"+account[j][z][2]);
                            tmp ++;
                        }else
                        {
                            System.out.println("密碼錯誤 !");
                            tmp++;
                        }
                    }else
                    {
                        break;
                    }
                }
            }
            if(tmp == 0)
            {
                System.out.println("error!");
            }
        }
        scanner.close();
    }
} 
