package leet.code.Problems.Arrays;

/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.


Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]
*/

import java.util.ArrayList;

public class CreateTargetArray {
//    void moveArrayEntriesFarwards(int[] nums,int index,int[] target){
//        if(nums[index]!=Integer.MAX_VALUE){
//
//        }else{
//            moveArrayEntriesFarwards(nums,index+1,target);
//        }
//    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int arrayLength = nums.length;
        int[] targetArray = new int[arrayLength];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arrayLength;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<arrayLength;i++){
            targetArray[i] = list.get(i);
        }
        return targetArray;
    }
}


/*
Memory Optimized the solution
*/
//class Solution {
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int arrayLength = nums.length;
//        int[] targetArray = new int[arrayLength];
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for(int i=0;i<arrayLength;i++){
//            list.add(index[i],nums[i]);
//        }
//        for(int i=0;i<arrayLength;i++){
//            targetArray[i] = list.get(i);
//        }
//        return targetArray;
//    }
//}