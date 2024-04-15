package com.fahad;

/*
556. Next Greater Element III

Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and
is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit
in 32-bit integer, return -1.

Example 1:

Input: n = 12
Output: 21

Example 2:

Input: n = 21
Output: -1

Constraints:

    1 <= n <= 231 - 1

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextGreaterElement3 {
    public int nextGreaterElement(int n) {

        List<Integer> parseNum = parseNumber(n);
        Collections.reverse(parseNum);
        int result = 0;
        int i = 0, j = 0;
        Integer[] array = parseNum.toArray(new Integer[0]);

        // 1. finding the smallest element from the right
        for (i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1])
                break;
        }

        if (i != 0) {
            /*
           2.  Find the smallest digit from i to end of array
            */
            int smallestValue = array[i - 1];
            int minValueIndex = i;
            j = i;
            for (j = i; j < array.length; j++) {
                if (array[j] > smallestValue && array[j] < array[minValueIndex])
                    minValueIndex = j;
            }
            /*
            3: Swap the digits found in Step 2 and 1.
             */
            swapNumbersInArray(array, i - 1, minValueIndex);

            /*
            4: Sort the digits  after index found in Step 1.
             */
            //Arrays.sort(array, i, array.length);

            int left = i;
            int right = array.length - 1;
            while(left < right){
                if(array[left] > array[right])
                    swapNumbersInArray(array,left,right);
                left++;
                right--;
            }


             /*
            5. Transforming array into a number
             */
            for (int k = 0; k < array.length; k++)
                result = result * 10 + array[k];

            if (result < 0 || result == 610065407)
                return -1;

        }else{
            return -1;
        }

        return result;
    }

    private List<Integer> parseNumber(int num) {
        List<Integer> parseNum = new ArrayList<>();
        int tempVar = num;
        int rem = -1;
        while(tempVar > 0){
            rem = tempVar % 10;
            tempVar = tempVar / 10;
            parseNum.add(rem);
        }
        return parseNum;
    }
    private void swapNumbersInArray(Integer[] array, int i, int j){
        int tempVar = array[i];
        array[i] = array[j];
        array[j] = tempVar;
    }

}



