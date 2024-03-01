package com.fahad;

import java.util.HashMap;

/*

169. Majority Element

Problem Type: Easy

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?

 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num: nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+ 1);
        }
        int majorityElement = 0;
        int n = nums.length;
        for(int num: frequencyMap.keySet()){
            if(frequencyMap.get(num)> n/2){
                majorityElement = num;
            }
        }

        return majorityElement;
    }
}
