/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.nkust.ic.thy;

/**
 *
 * @author User
 */
public class Teacher1 extends People{
    
    public Teacher1(String name,int age,String tid)
    {
        super(name,age);
        this.tid = tid;
    }
    public String tid;
}
