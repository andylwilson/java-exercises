/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stackexample;

/**
 *
 * @author andy
 */
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        String[] data = {"to", "be", "or", "not", "to", "be"};
        
        //create stack
        Stack<String> s = new Stack<>();
        //fill stack
        for (String str : data){
            s.push(str);
        }
        
        //print out the stack
        System.out.println("Stack = " + s);
        //size of the stack
        System.out.println("Size = " + s.size());
        //peek the stack
        System.out.println("Peek = " + s.peek());
        
        //remove items from the stack
        while (!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        System.out.println("Stack = " + s);
        
    }
}
