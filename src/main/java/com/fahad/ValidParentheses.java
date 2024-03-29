package com.fahad;

import java.util.HashMap;
import java.util.Map;

/*
20. Valid Parentheses

Problem Type - Easy

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

*/
public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> parentheseMap = new HashMap<>();
        parentheseMap.put('(',')');
        parentheseMap.put('{','}');
        parentheseMap.put('[', ']');

        StringBuilder parenthesesStack = new StringBuilder();

        for(char paranthese: s.toCharArray()){
            if(!parentheseMap.containsKey(paranthese)){
                if(parenthesesStack.isEmpty())
                    return false;
                if(!parenthesesStack.isEmpty() && parentheseMap.get(parenthesesStack.charAt(parenthesesStack.length()-1)) == paranthese)
                    parenthesesStack.deleteCharAt(parenthesesStack.length() - 1);
                else
                    return false;
            }else{
                parenthesesStack.append(paranthese);
            }
        }
        String temp = new String(parenthesesStack);
        return temp.isEmpty();
    }

}
