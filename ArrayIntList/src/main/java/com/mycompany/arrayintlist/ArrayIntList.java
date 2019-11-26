/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrayintlist;

/**
 *
 * @author andy
 */
public class ArrayIntList {
    //data fields
    private int[] elementData;
    private int size;
    //declare the class constant
    public static final int DEFAULT_CAPACITY = 100;
    
    //constructor
    public ArrayIntList(){
        this(DEFAULT_CAPACITY);
        size = 0;
    }
    
    //pre: capacity >=0
    public ArrayIntList(int capacity){
        elementData = new int [capacity];
        size = 0;
    }
    
    //add method: add to the end of the list
    //pre: size < capacity
    public void add(int value){
        elementData[size] = value;
        size++;
    }
    
    //pre: size < capacity && 0 <= index <=size
    public void add(int index, int value){
        for (int i = size; i > index; i--){
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }
    
    //pre: index <= index < size
    public void remove(int index){
        for (int i = index; i < size - 1; i++){
            elementData[i] = elementData[i+1];
        }
        size--;
    }
    
    public int size(){
        return size;
    }
    
    public int get(int index){
        return elementData[index];
    }
    
    public int indexOf(int value){
        for (int i = 0; i < size; i++){
            if (elementData[i] == value){
                return i;
            }
        }
        return -1;
    }
    //toString method
    public String toString(){
        if (size == 0){
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++){
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }
    
}
