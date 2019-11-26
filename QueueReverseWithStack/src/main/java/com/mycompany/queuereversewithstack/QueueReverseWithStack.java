/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.queuereversewithstack;

/**
 *
 * @author andy
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReverseWithStack {
    public static void main(String[] args) {
        //create the queue
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println("Original queue = " + q);
        
        //create a stack
        Stack<Integer> s = new Stack<>();
        
        //copy Q to S
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        System.out.print("Stack = " + s);
        System.out.println();
        
        //copy S to Q
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        System.out.println("Queue = " + q);
        
    }
    
}
