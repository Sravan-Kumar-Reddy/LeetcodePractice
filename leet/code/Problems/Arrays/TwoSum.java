package leet.code.Problems.Arrays;


import java.util.LinkedHashMap;

/*
Question:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int[] response = new int[2];
            LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                int remainder = target - nums[i];
                if((map.get(nums[i])!=null)){
                    response[0] = map.get(nums[i]);
                    response[1] = i;
                    break;
                }else{
                    map.put(remainder,i);
                }
            }
            System.out.print("[ ");
            for(int i=0;i<response.length;i++){
                System.out.print(response[i]+" ");
            }
            System.out.print("]");
            return response;
        }

    public int[] optimumTwoSum(int[] nums, int target) {
        int j = 1;
        for(int i=0; i<nums.length && (i+j)<nums.length; i++){
            if(nums[i]+nums[i+j] == target){
                return new int[]{i, i+j};
            }else if(i == nums.length-1-j){
                j++;
                i = -1;
            }
        }
        return null;
    }
}
