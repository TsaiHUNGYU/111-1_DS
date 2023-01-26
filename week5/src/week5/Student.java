package week5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student extends People{
    Student(String name,double age,String sid)
    {
        super(30,name);
        this.age = age;
        this.sid = sid;
        
    }
    
    double age;
    String sid;
    
    
    void get()
    {
        System.out.println(super.age);
    }
    
    
    @Override
    void run()
    {
        System.out.println("Student's run()");
    }
}
