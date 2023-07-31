/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeobj;
public class Rectangle extends Shape {
    private double length,width;
    
    public void setLenght(double l)
    {
        length=l;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double w)
    {
        width=w;
    }
    public double getWidth()
    {
        return width;
    }
    @Override
    public double calculateArea()
    {
        return length*width;
    }
    public void display()
    {
        System.out.println("Rectangle area is "+calculateArea());
    }
}
