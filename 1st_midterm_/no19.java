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
public class no19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte times;
        Scanner scanner = new Scanner(System.in);
        System.out.println("組數為 :");
        times = scanner.nextByte();
        for(byte i = 0;i < times;i++)
        {
            String[] count;
            int sum = 0;
            System.out.println("第"+(i+1)+"組:");
            Scanner scanner2 = new Scanner(System.in);
            count = scanner2.nextLine().split(" ");            
            sum = Integer.parseInt(count[0]) * 250 + Integer.parseInt(count[1]) * 175;
            System.out.println("第"+(i+1)+"組應收費用 :"+sum);
        }
        scanner.close();        
    }
    
}
