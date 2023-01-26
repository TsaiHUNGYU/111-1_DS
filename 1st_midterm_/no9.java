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
public class no9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入S1");
        String S1 = scanner.nextLine();
        System.out.println("請輸入S2");
        String S2 = scanner.nextLine();

        boolean judge = S2.contains(S1);
        if(judge)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        scanner.close();
    }
    
}
