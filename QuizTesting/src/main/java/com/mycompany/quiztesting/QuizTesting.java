/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiztesting;

/**
 *
 * @author andy
 */
import java.util.*;

public class QuizTesting {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<>();
    set1.add("Atlanta");
    set1.add("Macon");
    set1.add("Savanna");
    
    Set<String> set2 = new HashSet<>();
    set2.add("Atlanta");
    set2.add("Macon");
    set2.add("Savanna");
    
    Set<String> set3 = new HashSet<>();
    set3.add("Macon");
    set3.add("Savanna");
    set3.add("Atlanta");
    
    System.out.println(set1.equals(set2) + " " + set1.equals(set3));
    
    Map<String, String> map = new HashMap<>();
    map.put("123", "John Smith");
    map.put("111", "George Smith");
    map.put("123", "Steve Yao");
    map.put("222", "Steve Yao");
    
      System.out.println(map);
      
      System.out.println(xMethod(4));
      System.out.println(mystery1(16));
      
      int[] scores = {1, 20, 30, 40, 50};
      System.out.println(Arrays.toString(scores));
      System.out.println(Arrays.binarySearch(scores, 3));
      
      
    Stack<String> s = new Stack<>();

    Queue<String> q = new LinkedList<>();

    s.push("how");

    s.push("are");

    s.push("you");

    while (!s.isEmpty()){

                q.add(s.pop());
    }
    System.out.println(q);
    
Stack<Integer> s2 = new Stack<>();

s2.push(7);

s2.push(10);

System.out.print(s2.pop());

System.out.print(s2.peek());

s2.push(3);

s2.push(5);

System.out.print(s2.pop());

System.out.print(s2.isEmpty());

Queue<Integer> q3 = new LinkedList<>();

q3.add(10);

q3.add(4);

System.out.print(q3.size());

System.out.print(q3.peek());

q3.add(6);

System.out.print(q3.remove());

q3.add(3);

System.out.print(q3.remove());
    
    
  } //end of main
  
  
  
  
  
  
  
    static int xMethod(int n) {
        if (n == 1)
          return 1;
        else
          return n + xMethod(n - 1);
      }
        
    public static int mystery1(int n) {

        if (n <=1) {
            System.out.print(n);
        } else {
            mystery1(n/2);
            System.out.println(", " + n);

        }
          return 0;

}   




}