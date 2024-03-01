package com.fahad;

import java.util.HashSet;
import java.util.Set;

/*
1456. Maximum Number of Vowels in a Substring of Given Length.

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

Constraints:

    1 <= s.length <= 105
    s consists of lowercase English letters.
    1 <= k <= s.length

 */
public class MaxNumOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        Set<Character> vowelsContainer = new HashSet<>();
        vowelsContainer.add('a');
        vowelsContainer.add('e');
        vowelsContainer.add('i');
        vowelsContainer.add('o');
        vowelsContainer.add('u');

        int maxVowvelCount = 0;
        int vowelCountPerWindow = 0;

        for(int i = 0; i < k; i++) {
            if (vowelsContainer.contains(s.charAt(i))) {
                vowelCountPerWindow++;
            }
        }
        maxVowvelCount = vowelCountPerWindow;

        for(int right = k; right < s.length(); right++) {
            if (vowelsContainer.contains(s.charAt(right - k)))
                vowelCountPerWindow--;
            if (vowelsContainer.contains((s.charAt(right))))
                vowelCountPerWindow++;

            maxVowvelCount=Math.max(maxVowvelCount,vowelCountPerWindow);
        }
        return maxVowvelCount;
    }
}
