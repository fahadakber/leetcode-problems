package com.fahad;

import com.fahad.MergeSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        //88. Merge Sorted Array

       /* int[] nums1 = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3; int n = 3;

        //int[] nums1 = {0};
        //int[] nums2 = {1};
        //int m = 0; int n= 1;

        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1,m,nums2,n);
        //msa.merge2(nums1,m,nums2,n);*/


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

        /*//169. Majority Element
        MajorityElement me = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(me.majorityElement(nums));*/

        /*int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum ts = new TwoSum();
        ts.twoSum(nums,target);*/

        /*//189. Rotate Array
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray ra = new RotateArray();
        ra.rotate(nums,k);*/

        /*// 121. Best Time to Buy and Sell Stock
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));*/

        /*BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new BestTimeToBuyAndSellStock2();
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,2,3,4,5};
        System.out.println(bestTimeToBuyAndSellStock2.maxProfit(prices));*/

        /*//49. Group Anagrams
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strArray = {"eat","tea","tan","ate","nat","bat"};
        //List<List<String>> anagramsList = groupAnagrams.groupAnagrams(strArray);
        List<List<String>> anagramsList2 = groupAnagrams.groupAnagramsAlternateApproach(strArray);*/

        /*//242. Valid Anagram
        String s = "anagram", t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s,t));*/

        /*//55. Jump Game
        //int[] nums = {1};
        int[] nums = {2,0};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(nums));*/

        /*
        //20. Valid Parentheses
        ValidParentheses validParentheses = new ValidParentheses();
        //String parentheses = "()[]{}";
        //String parentheses = "(]";
        //String parentheses = "]";
        //String parentheses = "(])";
        String parentheses = "()";
        //System.out.print(validParentheses.isValid(parentheses));
        System.out.print(validParentheses.isValid_StackApproach(parentheses));
        */

        /*
        //1047. Remove All Adjacent Duplicates In String
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatedInString = new RemoveAllAdjacentDuplicatesInString();
        String str = "abbaca";
        System.out.println(removeAllAdjacentDuplicatedInString.removeDuplicates(str));
        System.out.println(removeAllAdjacentDuplicatedInString.removeDuplicates_StringBuilder(str));
        */

/*
        //556. Next Greater Element III
        NextGreaterElement3 nextGreaterElement3 = new NextGreaterElement3();
        int num = 230241; //passed   ... expected = 230412
        //int num = 2147483486;  // passed  //... expected = -1;
        //int num = 2147483476;  //passed   // ... expected = 2147483647;
        // int l = Integer.MAX_VALUE;
        //int num = 1999999999;   // ... expected = -1;

        *//*char[] a = ("" + num).toCharArray();
        int i = a.length - 2;*//*

        int result = nextGreaterElement3.nextGreaterElement(num);*/
/*
        //3. Longest Substring Without Repeating Characters
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
                new LongestSubstringWithoutRepeatingCharacters();
        //String str = "abcabcbb";
        String str = "pwwkew";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str);*/

        //226. Invert Binary Tree
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertBinaryTree.invertTree(root);

    }




}