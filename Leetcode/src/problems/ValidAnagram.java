package problems;

//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.Arrays;

///Example 1:
//
//    Input: s = "anagram", t = "nagaram"
//
//    Output: true
//
//    Example 2:
//
//    Input: s = "rat", t = "car"
//
//    Output: false


public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(findAnagram(s,t));
    }

    public static boolean findAnagram(String s,String t){
        char[] c = s.toCharArray();
       Arrays.sort(c);
        char[] ch = t.toCharArray();
        Arrays.sort(ch);
       if(Arrays.equals(c,ch)){
           return true;
       }


       return false;

    }
}
