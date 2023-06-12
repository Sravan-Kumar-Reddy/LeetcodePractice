package leet.code.Problems.Arrays;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.


Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]
*/

public class SmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int smallNumberCount=0;
            for(int j=0;j< nums.length;j++){
                if((i!=j)&&(nums[j]<nums[i])){
                    smallNumberCount++;
                }
                ans[i]=smallNumberCount;
            }
        }
        return ans;
    }
}

/*
Better Runtime Solution
*/

//public class SmallerThanCurrentNumber {
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] buckets = new int[102];
//
//        //Getting Frequency of every element
//        for (int num : nums) {
//            buckets[num]++;
//        }
//
//        for (int i = 1; i < buckets.length; i++) {
//            buckets[i] += buckets[i - 1];
//        }
//        int[] res = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                res[i] = 0;
//            } else {
//                res[i] = buckets[nums[i] - 1];
//            }
//        }
//        return res;
//    }
//}

/*
Memory Optimized Solution
*/

//class Solution {
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] smaller = new int[nums.length];
//        for (int i = 0; i < nums.length; i ++) {
//            int count = 0;
//            for(int num: nums) {
//                count += (nums[i] > num) ? 1 : 0;
//            }
//            smaller[i] = count;
//        }
//        return smaller;
//    }
//}
