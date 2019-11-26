/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcirclewithstaticmember;

/**
 *
 * @author andy
 */
public class TestCircleWithStaticMember {
    public static void main(String[] args) {
        System.out.println("Before creating objects ");
        System.out.println("The number of objects is "
        + Circle.numberOfObjects);
        
        //create c1
        Circle c1 = new Circle();
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius " + c1.radius +
                " and the number of objects " + c1.numberOfObjects);
        
        //create c2
        Circle c2 = new Circle(25);
        System.out.println("\nAfter creating c2");
        System.out.println("c2: radius " + c2.radius +
                " and the number of objects " + c2.numberOfObjects);
        
        
    }
    
}
