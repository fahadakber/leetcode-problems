package com.fahad;

/*

3. Longest Substring Without Repeating Characters

Problem Type - Medium

Given a string s, find the length of the longest
substring
without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

 */


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> charFrequency = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            charFrequency.put(c,charFrequency.getOrDefault(c,0) + 1);

            while(charFrequency.get(c) > 1){
                char tempChar = s.charAt(left);
                charFrequency.put(tempChar,charFrequency.get(tempChar) - 1);
                left++;
            }
            ans = Math.max(ans,right - left + 1);
            right++;
        }
        return ans;
    }
}
