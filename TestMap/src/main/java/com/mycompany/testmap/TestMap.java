/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testmap;

/**
 *
 * @author andy
 */
import java.util.*;
public class TestMap {
    public static void main(String[] args) {
        //create a hashmap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        
        System.out.println("Display entries in HashMap: ");
        System.out.println(hashMap + "\n");
        
        //create the treeMap from the HashMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("treeMap");
        System.out.println("Display entries in descending order of key");
        System.out.println(treeMap);
        
        //display each entry with name and age
        System.out.println("\nNames and ages are: ");
        
        //way 1: get keySet() and iterate using the for each loop
        System.out.println("Way 1: Get keySet and iterate using the for each loop\n");
        
        //get the keySet() into the set
        Set<String> set1 = treeMap.keySet();
        //for each loop
        for(String key : set1){
            System.out.println("Key: " + key + "\t\t" + " Value: " + treeMap.get(key));
        }
        
        //Way 2: get keySet() and iterate using Iterator interface
        System.out.println("\n\nWay2: Get keySet() and iterate using Iterator interface\n");
        
        //get keySet() into sets
        Set<String> set2 = treeMap.keySet();
        //Iterator
        Iterator<String> itr1 = set2.iterator();
        while(itr1.hasNext()){
            String key = itr1.next();
            System.out.println("Key: " + key + "\t\t" + "Value: " + treeMap.get(key));
        }
        
        
        
        
        
        
        
    }
}
