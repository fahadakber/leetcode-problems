package com.fahad;

// 383. Ransom Note
/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:

    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.

 */

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomNoteFrequency = new HashMap<>();
        Map<Character,Integer> magazineFrequency = new HashMap<>();

        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        for(char c : ransomArray)
            ransomNoteFrequency.put(c,ransomNoteFrequency.getOrDefault(c,0) + 1);

        for(char c: magazineArray)
            magazineFrequency.put(c,magazineFrequency.getOrDefault(c,0) + 1);

        for(Map.Entry<Character,Integer> entry : ransomNoteFrequency.entrySet()){
            char tempchar = entry.getKey();
            if(!magazineFrequency.containsKey(tempchar)) {
                return false;
            } else if(magazineFrequency.get(tempchar) >= entry.getValue()){
                    continue;
            }else{
                return false;
            }
        }
        return true;
    }


    public boolean canConstruct2(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false ;

        int[] alphabetsCounter = new int[26] ;

        for(char c : magazine.toCharArray())
            alphabetsCounter[c-'a']++ ;

        for(char c : ransomNote.toCharArray()){
            if(alphabetsCounter[c-'a']==0) return false ;
            alphabetsCounter[c-'a']-- ;
        }
        return true ; }
}