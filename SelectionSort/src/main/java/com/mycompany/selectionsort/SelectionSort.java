/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.selectionsort;

/**
 *
 * @author andy
 */
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        //create the array
        double[] myList = new double[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter five numbers: ");
        
        for (int i = 0; i < myList.length; i++){
            myList[i] = input.nextDouble();
        }
        //sort the array
        selectionSort(myList);
        System.out.println();
        System.out.println("My list after sort is: ");
        printList(myList);  
        
    }
    //printList method
    static void printList(double[] list){
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println("");
    }

    //selection sort method
    static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j<list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //swapp when if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;             
            }
        }
    }
}
