package com.fahad;


import java.util.HashSet;
import java.util.Set;

/*
1832. Check if the Sentence Is a Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence
is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "leetcode"
Output: false

Constraints:

    1 <= sentence.length <= 1000
    sentence consists of lowercase English letters.

 */
public class Pangram {
    public boolean checkIfPangram(String sentence){
        Set<Character> lowercaseAlphabets = new HashSet<>();
        for(char currChar: sentence.toCharArray())
            lowercaseAlphabets.add(currChar);

        return lowercaseAlphabets.size() == 26;
    }
}
