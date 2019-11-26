/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computefibonacci;

import java.util.Scanner;

/**
 *
 * @author andy
 */
public class ComputeFibonacci {
        public static void main(String[] args) {
        
        //create the scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for the Fibonacci number: ");
        
        int index = input.nextInt();
        
        //display the fibonacci number of index
        System.out.println("Fibonacci number at " + index + " is " + fib(index));

    }
        //recursive method
        public static long fib(long index){
            if (index == 0) //base case
                return 0;
            else if (index == 1) // second base case
                return 1;
            else //recursive calls
                return fib(index - 1) + fib(index - 2);
        }  
}
