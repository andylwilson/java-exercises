/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.distinctnumbers;

/**
 *
 * @author andy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    
    public static void main(String[] args) {
        //create the arraylist to store Integer values
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integers (input ends with 0): ");
        //declare variable to store user input temporarily
        int value;
        
        do {
            
            value = input.nextInt(); //read a value from the input
            //for each value, if it is not in the list, add to the list
            if (!list.contains(value) && value != 0) 
                list.add(value);
        } while (value != 0);
        
        //display the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
