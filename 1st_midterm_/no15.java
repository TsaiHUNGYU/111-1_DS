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
public class no15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pw = "";
        int tmp = 0;
        int[] x = {0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入一組四位數字 :");
        pw = scanner.nextLine();
        for(int i = 0;i < pw.length();i++)
        {
            x[i] = ((pw.charAt(i) - '0') + 7 )%10;            
        }
        tmp = x[0];
        x[0] = x[2];
        x[2] = tmp;
        tmp = x[1];
        x[1] = x[3];
        x[3] = tmp;
        System.out.print("輸出加密後的數字為 :");
        for(int i = 0;i < pw.length();i++)
        {
            System.out.print(x[i]);
        }
        scanner.close();
    }
    
}
