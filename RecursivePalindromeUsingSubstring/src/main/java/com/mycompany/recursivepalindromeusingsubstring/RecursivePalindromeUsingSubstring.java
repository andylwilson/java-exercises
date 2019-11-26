/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recursivepalindromeusingsubstring;

/**
 *
 * @author andy
 */
public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args) {
        
        System.out.println("Is moon a palindrome? " +  isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " +  isPalindrome("noon"));
        System.out.println("Is a a palindrome? " +  isPalindrome("a"));
        System.out.println("Is aba a palindrome? " +  isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " +  isPalindrome("ab"));
        System.out.println("Is madam a palindrome? " +  isPalindrome("madam"));       
    }
    
    //recursive method
    public static boolean isPalindrome(String s){
        if (s.length() <= 1) //base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length()-1)) //base case if first char != last char
            return false;
        else
            return isPalindrome(s.substring(1, s.length()-1));       
    }    
}
