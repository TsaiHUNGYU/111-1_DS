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
public class no14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一字串 :");
        text = scanner.nextLine();
        int textLength = text.length();
        System.out.println("There are " + textLength + " characters in the string.");
        scanner.close();
    }
    
}
