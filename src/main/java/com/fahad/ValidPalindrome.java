package com.fahad;

/*
125. Valid Palindrome
Problem Type - Easy

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.

*/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                stringBuilder.append(Character.toLowerCase(c));
        }

        String filteredString = stringBuilder.toString();
        String reverseString = stringBuilder.reverse().toString();

        return filteredString.equals(reverseString);

    }

    public boolean isPalindromeJava8Streams(String s){
        StringBuilder builder = new StringBuilder();
        s.
                chars()
                .filter(c->Character.isLetterOrDigit(c))
                .mapToObj(c->Character.toLowerCase((char)c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }

    public boolean isPalindromeTwoPointersApproach(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
