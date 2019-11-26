/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testiterator;

/**
 *
 * @author andy
 */

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        //create the LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("New York");
        list.add("Atlanta");
        list.add("Dallas");
        list.add("Madison");
        
        //create the Iterator to traverse the list
        Iterator<String> iterator = list.iterator();   
        while(iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();  
    }  
}
