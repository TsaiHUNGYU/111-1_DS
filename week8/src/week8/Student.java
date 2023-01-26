/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author User
 */
public class Student {
    String name;
    int age;
    
    Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toStrinig()
    {
        return (this.name + String.valueOf(age));
    }
}
