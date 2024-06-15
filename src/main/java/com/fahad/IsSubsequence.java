package com.fahad;

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
