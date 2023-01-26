/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


import tw.edu.nkust.ic.thy.*;

/**
 *
 * @author User
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        People handsome = new People();
//        handsome.name = "xxxx";
//        handsome.age = 30;
          Student C109156219 = new Student();
          C109156219.name = "thy";
          C109156219.age = 20;
          C109156219.sid = "c109156219";
          Student1 C109156220 = new Student1();
          C109156220.name = "yyy";
          
          
          Teacher xxx = new Teacher();
          xxx.name = "xx";
          xxx.age = 50;
          xxx.tid = "t123";
          Teacher1 kkk = new Teacher1("kkk",60,"kkk123");
          
          System.out.println(kkk.name);
          
    }
    
}
