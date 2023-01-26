/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class Point {
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x ,int y){
        this.x = x;
        this.y = y;
    }
    
    private int x = 0;
    private int y = 0;
    
    
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return this.y;
    }
}
