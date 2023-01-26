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
public class no5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 1;
        int tmp = 1;
        int M;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入階層值M :");
        M = scanner.nextInt();
        while(true)
        {
            N+=1;
            tmp = tmp*N;
            if(tmp<M)
            {
                // System.out.println(N);
            }
            else
            {
                break;
            }
        }
        System.out.println("超過M為"+M+"的最小階層N值為:"+N);
        scanner.close();
    }
    
}
