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
public class no20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String iString = "";
        String[][][] student = 
        {
            {{"123", "Tom", "DTGD"}, {"456", "Cat", "CSIE"}, {"789", "Nana", "ASIE"}},
            {{"321", "Lim", "DBA"}, {"654", "Won", "FDD"}}
        };
        

        System.out.println("請輸入查詢學號為 :");
        iString = scanner.nextLine();
        for(int i = 0;i < student.length;i++)
        {
            for(int j = 0;j < student.length;j++)
            {
                if (iString.equals(student[i][j][0])) 
                {
                    System.out.println("學號 : " + iString);
                    System.out.println("姓名 : " + student[i][j][1]);
                    System.out.println("系別 : " + student[i][j][2]);
                }
            }
        }
        scanner.close();
    }
    
}
