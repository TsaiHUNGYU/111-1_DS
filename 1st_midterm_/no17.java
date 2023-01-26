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
public class no17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] card;
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入五張牌:");
        card = scanner.nextLine().split(" ");
        
        for(int i = 0;i < card.length; i++)
        {
            switch(card[i])
            {
                case "A":
                    card[i] = "1";
                    break;
                case "J":
                    card[i] = "11";
                    break;
                case "Q":
                    card[i] = "12";
                    break;
                case "K":
                    card[i] = "13";
                    break;
            }
        }
        int sum = 0;
        for(int i = 0;i < card.length;i++)
        {
            // System.out.println(card[i]);
            sum+=Integer.parseInt(card[i]);
        }
        System.out.println("加總值 :"+sum);
        scanner.close();
    }
    
}