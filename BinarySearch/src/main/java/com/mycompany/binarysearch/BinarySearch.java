/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.binarysearch;

/**
 *
 * @author andy
 */
public class BinarySearch {
    public static void main(String[] args) {
        //create the array
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
            System.out.println(binarySearch(list, 2));
            System.out.println(binarySearch(list, 11));
            System.out.println(binarySearch(list, 12));
            System.out.println(binarySearch(list, 1));
            System.out.println(binarySearch(list, 3));
            
    }
    
    /*binarySearch method, for demonstration; normally just use built-in binary
    function in java libraries*/
    public static int binarySearch(int[] list, int key){
        //low index in the array
        int low = 0;
        int high = list.length -1;
        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            } else if (key == list[mid]){
                return mid;
            } else {
                return low = mid + 1;
            }  
        }
        return -low - 1;
    }
}
