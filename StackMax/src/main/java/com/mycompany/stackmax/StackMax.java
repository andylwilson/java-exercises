/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stackmax;

import java.util.Stack;

/**
 *
 * @author andy
 */
public class StackMax {
    public static void main(String[] args) {
        Integer[] data = {5, 8, 16, 7, 9};
        
        //create stack
        Stack<Integer> s = new Stack<>();
        //fill stack
        for (Integer num : data){
            s.push(num);
        }
        
        //print out the stack
        System.out.println("Original stack = " + s);
        //size of the stack
        System.out.println("Size = " + s.size());
        //peek the stack
        System.out.println("Peek = " + s.peek());
        System.out.println("The max number in the stack is: " + max(s));
        System.out.println("Stack = " + s);
        
    }
        
        public static int max(Stack<Integer> s){
            //backup stack
            Stack<Integer> backup = new Stack<>();
            //declare variable to hold max value
            int maxValue = s.pop();
            //fill the backup stack
            backup.push(maxValue);
            //remove items from the stack
            while (!s.isEmpty()){
                int next = s.pop();
                backup.push(next);
                maxValue = Math.max(maxValue, next);
            }
        System.out.println();
        System.out.println("The backup stack = " + backup);
        
        //rebuild the original stack from the backup stack
        while (!backup.isEmpty()){
            s.push(backup.pop());
        }
        System.out.println("The backup stack after original stack is rebuilt = " + backup);
        return maxValue;
        }
        
    
}
