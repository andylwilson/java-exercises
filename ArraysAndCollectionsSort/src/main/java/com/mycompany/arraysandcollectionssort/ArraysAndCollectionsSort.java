/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysandcollectionssort;

/**
 *
 * @author andy
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArraysAndCollectionsSort {
    
    //do from home from PPT chapter 13 slide 34
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        String[] words = {"foo", "bar", "baz", "ball"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList(words));
        Collections.sort(words2);
        System.out.println(words2);
    }
}