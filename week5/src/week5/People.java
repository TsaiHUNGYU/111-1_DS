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
public class People {
    People(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    
    int age;
    String name;
    
    
    void run()
    {
        System.out.println("People's run()");
    }
}
