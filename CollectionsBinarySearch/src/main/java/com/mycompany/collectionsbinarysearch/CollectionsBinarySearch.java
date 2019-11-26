/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsbinarysearch;

/**
 *
 * @author andy
 */
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class CollectionsBinarySearch {
    
    public static void main(String[] args) {
        //create the array
        Integer[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        //build the ArrayList from this existing array
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(list));
        System.out.println("Index is " + Collections.binarySearch(list1, 2));
        System.out.println("Index is " + Collections.binarySearch(list1, 11));
        System.out.println("Index is " + Collections.binarySearch(list1, 12));
        System.out.println("Index is " + Collections.binarySearch(list1, 1));
        System.out.println("Index is " + Collections.binarySearch(list1, 3));

        //build char array
        char[] chars = {'a','c','g','x','y','z'};
        System.out.println("Index is " + Arrays.binarySearch(chars, 't'));
        
        Character[] char1 = {'a','c','g','x','y','z'};
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList(char1));
        System.out.println("Index is " + Collections.binarySearch(list2, 'c'));
    }
    
}
