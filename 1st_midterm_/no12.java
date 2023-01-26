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
public class no12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入一整數序列 :");
        String number = scanner.nextLine();
        String[] Lnumber = number.trim().split(" ");
        byte counter = 0;
        int take = 0;
        for(int i = 0; i < Lnumber.length; i++)
        {
            int count = 0;            
            for(int j = 0; j < Lnumber.length; j++)
            {
                if(Lnumber[i].contains(Lnumber[j]))
                {
                    count ++;
                }
            }
            if((count > Lnumber.length/2))
            {
                take = Integer.parseInt(Lnumber[i]);
                counter = (byte)count;
            }
        }        
        if(counter == 0)
        {
            System.out.println("過半元素為：NO");
        }
        else
        {
            System.out.println("過半元素為："+take);
        }
        scanner.close();
    }
}