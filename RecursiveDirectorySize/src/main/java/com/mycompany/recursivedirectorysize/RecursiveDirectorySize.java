/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recursivedirectorysize;

/**
 *
 * @author andy
 */
import java.io.File;
import java.util.Scanner;

public class RecursiveDirectorySize {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        System.out.println(getSize(new File(directory)) + " bytes");
    }
    
    //recursive method
    public static long getSize(File file){
        //store the total size of all files
        long size = 0;
        if (file.isDirectory()){
            File[] files = file.listFiles(); //all files and subdirectories
            for (int i = 0; i< files.length ; i++){
                size += getSize(files[i]); //recursive call
            }
        } else { //base case
            size += file.length();
        }
        return size;
    }
    
}
