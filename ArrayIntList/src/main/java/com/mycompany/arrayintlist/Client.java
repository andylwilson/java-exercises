/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrayintlist;

/**
 *
 * @author andy
 */
public class Client {
    public static void main(String[] args) {
        //construct 2 lists
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();
        
        //add values to both lists
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        list2.add(7);
        list2.add(-8);
        
        //display the results in both of the lists
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        
        list1.add(3, 7);
        System.out.println("list1 using add and index param = " + list1);
        list1.remove(3);
        System.out.println("list1 after removing at index 3 = " + list1);
        System.out.println("index at 3: " + list1.indexOf(3));
        System.out.println("index at 10, which is out of bounds: " + list1.indexOf(10));
    }
    
}
