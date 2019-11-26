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
public class TestCircle {
    public static void main (String[] args){
        
        //create circle with radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle 1 of radius "
        + circle1.radius + " is " + circle1.getArea() +
                " The perimeter is " + circle1.getPerimeter());
        
        //create circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle 2 of radius "
        + circle2.radius + " is " + circle2.getArea() +
                " The perimeter is " + circle2.getPerimeter());
        
        //create circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle 3 of radius "
        + circle3.radius + " is " + circle3.getArea() +
                " The perimeter is " + circle3.getPerimeter());
        
        //modify circle2 radius
        circle2.setRadius(100);
        System.out.println("The area of the circle 2 of radius " + circle2.radius
        + " is " + circle2.getArea());
        
        
    }
    
}
