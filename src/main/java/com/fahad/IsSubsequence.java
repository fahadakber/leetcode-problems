package com.fahad;

/*
392. Is Subsequence
Problem Type - Easy
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false



Constraints:

    0 <= s.length <= 100
    0 <= t.length <= 104
    s and t consist only of lowercase English letters.


Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 */

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        // traverse both strings and compare each char of s with t. if the character is
        // found in both string then move pointers in both string else move the pointer of
        // bigger string.
        // if the pointer value of small string matches with it length (i == s.length - 1) then
        // return true else false
        if(s.isEmpty())
            return true;

        int sLength = s.length();
        int tLength = t.length();
        int i = 0, j = 0;
        while(i < sLength && j < tLength){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else
                j++;
        }
        if(i == sLength)
            return true;
        else
            return false;
    }
}
