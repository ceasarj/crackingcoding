package chapter1.arrayandstrings;

import java.util.HashSet;

/**
 * Implement an algorithm to determing if the string has all unique characters. What if you can't use any
 * additiona datasctructures?
 */
public class problem1 {

    HashSet<Character> set;

    public boolean isUnique(String s){
        set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        return s.length() == set.size();
    }


    public static void main(String[] args){
        problem1 prob = new problem1();
        String s = "hello";
        System.out.println("Expected: False" + "\nActual: " +prob.isUnique(s));
        s = "jimen";
        System.out.println("\nExpected: True" + "\nActual: " +prob.isUnique(s));
        s = "qwertyuioplkjhgfdsazxcvbnm";
        System.out.println("\nExpected: True" + "\nActual: " +prob.isUnique("qwertyuioplkjhgfdsazxcvbnm"));
        s = "qwertyuioplktjhgfdsazxcvbnm";
        System.out.println( "\nExpected: False" + "\nActual: " + prob.isUnique("qwertyuioplktjhgfdsazxcvbnm"));
    }
}
