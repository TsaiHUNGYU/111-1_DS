/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1st_midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class no25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("檢測的字串(end:結束) :");
            Scanner scanner = new Scanner(System.in);
            String firstString = scanner.nextLine();
            int count = 0;
            if(firstString != "end")
            {
                System.out.println(firstString);
                System.out.println("檢測的單一字元 :");
                Scanner scanner2 = new Scanner(System.in);
                String secondString = scanner2.nextLine();
                for(int i = 0;i < firstString.length();i++)
                {
                    if(firstString.contains(secondString))
                    {
                        count++;
                        System.out.println(count);
                    }
                }
                System.out.println(count);
            }
            else if(firstString == "end")
            {
                break;
            }
        }    
    }
    
}
