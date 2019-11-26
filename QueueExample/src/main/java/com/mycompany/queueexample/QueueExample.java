/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.queueexample;

/**
 *
 * @author andy
 */
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
    public static void main(String[] args) {
        String[] data = {"to", "be", "or", "not", "to", "be"};
        
        //create queue
        Queue<String> q = new LinkedList<>();
        //fill stack
        for (String str : data){
            q.add(str);
        }
        
        //print out the stack
        System.out.println("Queue = " + q);
        //size of the stack
        System.out.println("Size = " + q.size());
        //peek the stack
        System.out.println("Peek = " + q.peek());
        
        //remove items from the stack
        while (!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        System.out.println("Queue = " + q);
        
    }
}
