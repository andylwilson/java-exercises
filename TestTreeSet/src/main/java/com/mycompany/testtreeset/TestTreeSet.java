/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testtreeset;

/**
 *
 * @author andy
 */
import java.util.*;
public class TestTreeSet {
    
    public static void main(String[] args) {
                    //create a hash set
        HashSet<String> set = new HashSet<>();
        
        //add elements to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println("Hash set: " + set);
        
        //create treeset from the hashset
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);
        
        //use the methods in SortedSet interface (tree set implements)
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast():" + treeSet.pollLast());
        System.out.println("Tree set now contains: " + treeSet);
        
    }
}
