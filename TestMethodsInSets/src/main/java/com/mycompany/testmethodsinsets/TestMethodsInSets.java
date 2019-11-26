/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmethodsinsets;

/**
 *
 * @author andy
 */
import java.util.*;
public class TestMethodsInSets {
    public static void main(String[] args) {
                    //create a hash set
        HashSet<String> set1 = new HashSet<>();
        
        //add elements to the set
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("New York");
        
        System.out.println("Set1 is: " + set1);
        System.out.println(set1.size() + " elements in set1");
        
        //create set2
        HashSet<String> set2 = new HashSet<>();
        
        //add elements to the set
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\nSet2 is " + set2);
        System.out.println(set2.size() + " elements in set2");
        
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
        
        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);
        
        set1.removeAll(set2);
        System.out.println("\nAfter removing set2 from set1, set1 is " + set1);
        
        set1.retainAll(set2);
        System.out.println("\nAfter removing common elements in set2 from set1, "
                + "set1 is " + set1);
        
    }

    
}
