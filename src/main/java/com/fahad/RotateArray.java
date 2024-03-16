package com.fahad;

/*
189. Rotate Array

Problem Type - Medium

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

Constraints:

    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    0 <= k <= 105

Follow up:

    Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
    Could you do it in-place with O(1) extra space?

*/

public class RotateArray {

    /* For below brute force solution time limit exceeded in leetcode on the 37th test case (37/38) */
    public void rotateBruteForce(int[] nums, int k) {
        while (k > 0){
            for(int j = nums.length - 1; j > 0; j--){
                int tempVar = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = tempVar;
            }
            k--;
        }
    }

    // Alternate approach
    /*
        We use an extra array in which we place every element of the array at its correct
        position i.e. the number at index iii in the original array is placed at the
        index (i+k)% length of array(i + k) \% \text{ length of array}(i+k)% length of array.
        Then, we copy the new array to the original one.
     */
        public void rotate(int[] nums, int k) {
        int[] copyArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copyArray[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copyArray[i];
        }
    }

   /* class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            rotate(nums, 0, n-1);
            rotate(nums, 0, k-1);
            rotate(nums, k, n-1);
        }

        public void rotate(int[] nums, int b, int e) {
            while (b < e) {
                int i = nums[b];
                nums[b] = nums[e];
                nums[e] = i;
                b++;
                e--;
            }
        }
    }*/

}
