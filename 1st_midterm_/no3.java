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
public class no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] zodiac = 
        {
            "rat",
            "ox",
            "tiger",
            "rabbit",
            "dragon",
            "snake",
            "horse",
            "sheep",
            "monkey",
            "rooster",
            "dog",
            "pig"
        };
        int year;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("出生年份 :");
        year = scanner.nextInt();
        System.out.println(zodiac[year%12-4]);
        scanner.close();
    }   
}
