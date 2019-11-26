/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testlistiterator;

import java.util.*;

/**
 *
 * @author andy
 */
public class TestListIterator {
    
    public static void main(String[] args) {
        //create the LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        //create the Iterator to traverse the list
        ListIterator<String> iterator = list.listIterator();
        
        System.out.println("Display list elements in forward direction: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        //traverse the list in backward direction
        System.out.println("Display list elements in backward direction");
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
        
    } 
    
}
