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
public class Cylinder extends Circle {
    public Cylinder()
    {
        
    }
    public Cylinder(double height)
    {
        this.height = height;
    }
    public Cylinder(double height,double radius)
    {
        this.height = height;
        this.radius = radius;
    }
    private double height;
    public double radius;

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
