/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testarraylist;

/**
 *
 * @author andy
 */
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        //create an arraylist to store cities
        ArrayList<String> cityList = new ArrayList<>();
        
        //add some cities to the arraylist
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        
        //display arraylist size
        System.out.println("List size? " + cityList.size());
        
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        
        System.out.println("The location of Denver in the list? " + 
                cityList.indexOf("Denver"));
        
        System.out.println("Is the list empty? " + cityList.isEmpty());
        
        //insert a new city at index 2
        cityList.add(2, "Xian");
        //remove a city from the list
        cityList.remove("Miami");
        //remove a city at index 1
        cityList.remove(1);
        
        //display the content of the list
        System.out.println(cityList.toString());
        
        //display the contents of the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--){
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();
        
        //create another arraylist to store circle objects
        ArrayList<Circle> list = new ArrayList<>();
        //add 2 circles into the arraylist
        list.add(new Circle(2));
        list.add(new Circle(3));
        
        //display the area for those circles
        System.out.println("The area of the 1st circle? " + 
                list.get(0).getArea());
        
        System.out.println("The area of the 2nd circle? " + 
                list.get(1).getArea());
        
        
        ArrayList<String> testList = new ArrayList<>();
        testList.add("red");
        testList.add("red");
        testList.add("green");
        
        //for quiz
        String element = "red";
for (int i = testList.size() - 1; i >= 0; i--)
  if (testList.get(i).equals(element))
    testList.remove(element);

        System.out.println(testList.toString());
        
    } 
}
