/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lifeobj;

public class  LifeGame implements Movement {
    @Override
    public void moveup(){
        System.out.println("Player Moved up");
    }
    @Override
    public void movedown(){
        System.out.println("Player moved down");
    }
    @Override
    public void moveright(){
        System.out.println("Player moved right");
    }
    @Override
    public void moveleft(){
        System.out.println("Player moved left");
    }
}
