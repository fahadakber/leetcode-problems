package com.fahad;

import com.fahad.MergeSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        /*
        ReversePrefixOfAWord rpow = new ReversePrefixOfAWord();
        String str = "rzwuktxcjfpamlonbgyieqdvhs";
        System.out.println(str);
        System.out.println(rpow.reversePrefix(str,'z'));
        */

        /*
        MinimumSizeSubarraySum msss = new MinimumSizeSubarraySum();
        int target = 4;
        int[] nums = {1,4,4};

        System.out.println(msss.minSubArrayLen(target,nums));
        */

        /*
        //String s = "tryhard";
        String s = "weallloveyou";
        int k = 7;
        MaxNumOfVowelsInASubstringOfGivenLength max = new MaxNumOfVowelsInASubstringOfGivenLength();
        System.out.println(max.maxVowels(s,k));
        */

        /*

        1208 - Get Equal Substring Within Budget

        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        GetEqualSubstringsWithinBudget geswb = new GetEqualSubstringsWithinBudget();
        System.out.println(geswb.equalSubstring(s,t,maxCost));
         */

        /*
        //1732. Find the Highest Altitude

        FindTheHighestAltitude ftha = new FindTheHighestAltitude();
        int[] gain = {-5,1,5,0,-7};
        System.out.println(ftha.largestAltitude(gain));
         */

        /*
        //303. Range Sum Query - Immutable

        NumArray na = new NumArray(new int[]{-2,0,3,-5,2,-1});
        //System.out.println(na.sumRange(0,2));
        //System.out.println(na.sumRange(0,5));
        System.out.println(na.sumRange(2,5));

         */
        /*

        27. remove Element

        RemoveElement re = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(re.removeElement(nums,val));

         */

        /*
        88. Merge Sorted Array

        int[] nums1 = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3; int n = 3;

       *//* int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0; int n= 1;
        *//*
        MergeSortedArray msa = new MergeSortedArray();
        //msa.merge(nums1,m,nums2,n);
        msa.merge2(nums1,m,nums2,n);

        */

       /* //1832. Check if the Sentence Is a Pangram
        Pangram pangram = new Pangram();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangram.checkIfPangram(sentence));

        String sentence2 = "leetcode";
        System.out.println(pangram.checkIfPangram(sentence2));*/

      /*  //268. Missing Number
        MissingNumber mn = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(mn.missingNumber(nums));*/


        /*
        //80. Remove Duplicates From Sorted Array II
        int[] nums = {1,1,1,2,2,3};
        RemoveDuplicatesFromSortedArray2 rdfsa2 = new RemoveDuplicatesFromSortedArray2();
        rdfsa2.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        */

        //169. Majority Element
        MajorityElement me = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(me.majorityElement(nums));


    }




}