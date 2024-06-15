package com.fahad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
151. Reverse Words in a String
Problem Type - Medium

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should
only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.



Constraints:

    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

 */
public class ReverseWordsInAString {
    private StringBuilder reverseWordsInString = new StringBuilder();

    public String reverseWords(String s) {

        // trimming leading and trailing spaces in a string
        s = s.trim();
        // splitting the string by space delimeter in an array/list
        List<String> listOfStrings = Arrays.asList(s.split("\\s+"));
        // reverse the string in above list
        Collections.reverse(listOfStrings);
        // joing the strings in above list with space
        return String.join(" ",listOfStrings);
    }


    public String reverseWords2(String s) {

        // trimming leading and trailing spaces in String using StringBuilder
        trimSpaces(s);
        // reverse all characters in StringBuilder
        reverseCharacters(reverseWordsInString,0,reverseWordsInString.length()-1);
        // reverse words in String Builder
        reverseWordsInString(reverseWordsInString);

        return reverseWordsInString.toString();

    }

    private void reverseWordsInString(StringBuilder reverseWordsInString) {
        int start = 0;
        int end = 0;

        while(end < reverseWordsInString.length()-1){
            if(reverseWordsInString.charAt(end) != ' ') {
                end++;
            }
            else {
                reverseCharacters(reverseWordsInString, start, end - 1);
                start = end + 1;
                end++;
            }
        }
        reverseCharacters(reverseWordsInString, start, end);

    }

    private void reverseCharacters(StringBuilder reverseWordsInString, int left, int right) {
        while(left <= right){
            char temChar = reverseWordsInString.charAt(left);
            reverseWordsInString.setCharAt(left++,reverseWordsInString.charAt(right));
            reverseWordsInString.setCharAt(right--,temChar);
        }
    }

    private void trimSpaces(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right && s.charAt(left) == ' ') left++;

        while(left < right && s.charAt(right) == ' ')right--;

        while(left <= right){
            char c = s.charAt(left);
            if(c != ' ')
                reverseWordsInString.append(c);
            else if(reverseWordsInString.charAt(reverseWordsInString.length()-1) != ' ')
                reverseWordsInString.append(c);

            left++;
        }
    }
}