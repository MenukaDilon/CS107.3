package com.mycompany.containerobj;

public class ContainerObj {

    public static void main(String[] args) {
        CylindericalContainer c=new CylindericalContainer(8.5,9.5);
        System.out.println("Cylinder Volume: "+c.volume());
    }
}
