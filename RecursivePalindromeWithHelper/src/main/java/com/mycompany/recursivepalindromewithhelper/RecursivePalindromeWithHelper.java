/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recursivepalindromewithhelper;

/**
 *
 * @author andy
 */
public class RecursivePalindromeWithHelper {
    
    public static void main(String[] args) {
        
        System.out.println("Is moon a palindrome? " +  isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " +  isPalindrome("noon"));
        System.out.println("Is a a palindrome? " +  isPalindrome("a"));
        System.out.println("Is aba a palindrome? " +  isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " +  isPalindrome("ab"));
        System.out.println("Is madam a palindrome? " +  isPalindrome("madam"));       
    }
    
    //original palindrome method
    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length()-1); 
    }
    
    //recursive helper method
    public static boolean isPalindrome(String s, int low, int high){
        if (high <= low) //base case
            return true;
        else if (s.charAt(low) != s.charAt(high))//second base case
            return false;
        else
            return isPalindrome(s, low+1, high-1);       
    }   
}
