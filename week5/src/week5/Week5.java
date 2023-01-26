/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author User
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student C109 = new Student("xxx",33.3,"c109");
        System.out.println(C109.age);
        System.out.println(C109.name);
        System.out.println(C109.sid);
        
        
        C109.run();
        
        People kk;
        kk = (People)C109;
        kk.run();
    }
    
}
