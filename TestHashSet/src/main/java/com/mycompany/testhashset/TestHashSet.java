/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testhashset;

/**
 *
 * @author andy
 */
import java.util.*;

public class TestHashSet {
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
        
        System.out.println(set);
        
        //display elements in the hash set using iterable interface foreach
        for (String s : set){
            System.out.print(s.toUpperCase() + " ");
        }
        System.out.println();
        
        for (String s : set){
            System.out.print(s.toLowerCase() + " ");
        }
    }  
}
