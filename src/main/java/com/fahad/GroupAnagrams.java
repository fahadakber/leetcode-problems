package com.fahad;

/*
49. Group Anagrams

Problem Type - Medium

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]
Output: [["a"]]

Constraints:

    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.

*/

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String,List<String>> anagramMapOfStrings = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String tempKey = new String(charArray);

            if(!anagramMapOfStrings.containsKey(tempKey)){
                anagramMapOfStrings.put(tempKey,new ArrayList<>());
            }
            anagramMapOfStrings.get(tempKey).add(str);
        }

        return new ArrayList<>(anagramMapOfStrings.values());
    }

    public List<List<String>> groupAnagramsAlternateApproach(String[] strs) {

        if (strs.length == 0) return new ArrayList<>();

        Map<String,List<String>> anagramMapOfStrings = new HashMap<>();
        int[] tempArray = new int[26];
        for(String str: strs){
            Arrays.fill(tempArray,0);
            StringBuilder tempStringBuilder = new StringBuilder();
            for(char tempChar:str.toCharArray())
                tempArray[tempChar - 'a']++;
            for(int j = 0; j < tempArray.length; j++){
                tempStringBuilder.append("#");
                tempStringBuilder.append(tempArray[j]);
            }
            String tempKey = new String(tempStringBuilder);
            if(!anagramMapOfStrings.containsKey(tempKey)){
                anagramMapOfStrings.put(tempKey,new ArrayList<>());
            }
            anagramMapOfStrings.get(tempKey).add(str);
        }

        return new ArrayList<>(anagramMapOfStrings.values());
    }
}
