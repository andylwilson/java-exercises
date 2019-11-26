/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computefactorial;

/**
 *
 * @author andy
 */

import java.util.*;

public class ComputeFactorial {
    public static void main(String[] args) {
        
        //create the scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        
        int n = input.nextInt();
        
        //display the factorial of the n
        System.out.println("Factorial of " + n + " is " + factorial(n));

    }
    
    //factorial function definition
    public static long factorial(int n){
        if (n == 0) //base case
            return 1;
        else 
            return n * factorial(n-1); //recursive call
    } 
}
