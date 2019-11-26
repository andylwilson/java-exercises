/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcircle;

/**
 *
 * @author andy
 */
public class Circle {
    //data field
    double radius;
    
    //constructor with radius 1
    public Circle(){
        radius = 1;
    }
    //another constructor with a specified radius
    public Circle(double newRadius){
        radius = newRadius;
    }
    
    //methods
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    //set a new radius for this circle
    public void setRadius(double newRadius){
        radius = newRadius;
    }
}
