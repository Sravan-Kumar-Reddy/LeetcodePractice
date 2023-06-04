package leet.code.DriverClass;

import leet.code.Problems.Arrays.MaxSubArray;
import leet.code.Problems.Arrays.TwoSum;

public class DriverClass {

    public static void main(String[] args) {

//         int[] twoSumArray1 = new int[]{3,2,4};
//         int[] twoSumArray2 = new int[]{3,3};
//         int[] twoSumArray3 = new int[]{2,7,11,15};
//         int[] twoSumArray4 = new int[]{2,5,5,11};
//        TwoSum twoSum = new TwoSum();
//        twoSum.twoSum(twoSumArray1,6);
//        twoSum.optimumTwoSum(twoSumArray2,6);
//        twoSum.optimumTwoSum(twoSumArray3,22);
//        twoSum.twoSum(twoSumArray4,10);

         int[] nums1 = new int[] {1,2,3,1};
         int[] nums2 = new int[] {1,2,3,4};
         int[] nums3 = new int[] {1,1,1,3,3,4,3,2,4,2};
         int[] nums4 = new int[] {1,1};
         int[] nums5 = new int[] {2,14,18,22,22};
//         DuplicateChecker dupChecker = new DuplicateChecker();
//         System.out.println(dupChecker.checkDuplicates(nums1));
//         System.out.println(dupChecker.checkDuplicates(nums2));
//         System.out.println(dupChecker.checkDuplicates(nums3));
//         System.out.println(dupChecker.checkDuplicates(nums4));
//         System.out.println(dupChecker.checkDuplicates(nums5));
         int [] a = {-1, -3, -3, -1, -2, -1, -5, -3,-12};
         MaxSubArray maxSubArray = new MaxSubArray();
         System.out.println(maxSubArray.maxSubArray(a));
//         maxSubArray.maxSubArray(nums2);
//         maxSubArray.maxSubArray(nums3);
//         maxSubArray.maxSubArray(nums4);
//         maxSubArray.maxSubArray(nums5);
    }
}
