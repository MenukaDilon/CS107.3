/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeobj;

public class Circle extends Shape {
   private double radius;
   final double PI=3.14;
   
   public void setRadius(double r)
   {
       radius=r;
   }
   public double getRadius()
   {
       return radius;
   }

   @Override
   public double calculateArea()
   {
      return PI*(radius+radius);
   }
   public void display()
   {
       System.out.println("Circle Area is: "+calculateArea());
   }
}
