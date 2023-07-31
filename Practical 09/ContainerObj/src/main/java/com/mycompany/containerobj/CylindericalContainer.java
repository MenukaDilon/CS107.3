package com.mycompany.containerobj;

public class CylindericalContainer extends Container {
    private double height,radius;
    final static double PI=3.14159;
    
    public CylindericalContainer(double h,double r)
    {
        height=h;
        radius=r;
    }
    
    public double volume(){
        return PI*radius*radius*height;
    }
}
