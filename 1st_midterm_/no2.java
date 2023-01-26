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
public class no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kwh;
        double summer,nonsummer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入所使用的度數 :");
        kwh = scanner.nextInt();
        if(kwh<=120){
            summer = kwh*2.1;
            nonsummer = kwh*2.1;
        }else if(kwh>=121 && kwh<=330){
            summer = kwh*3.02;
            nonsummer = kwh*2.68;
        }else if(kwh>=331 && kwh<=500){
            summer = kwh*4.39;
            nonsummer = kwh*3.61;
        }else if(kwh>=501 && kwh<=700){
            summer = kwh*4.97;
            nonsummer = kwh*4.01;
        }else{
            summer = kwh*5.63;
            nonsummer = kwh*4.5;
        }
        System.out.println("Summer month:"+summer);
        System.out.println("Non-Summer month:"+nonsummer);
        scanner.close();
    }
    
}
