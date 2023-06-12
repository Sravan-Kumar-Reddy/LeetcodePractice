package leet.code.DriverClass;

import leet.code.Problems.Arrays.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DriverClass {
    public static void printArray(int[] nums) {
        IntStream list = Arrays.stream(nums);
        list.forEach(i -> System.out.print(i + " "));
    }

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

//         int[] nums1 = new int[] {1,2,3,1};
//         int[] nums2 = new int[] {1,2,3,4};
//         int[] nums3 = new int[] {1,1,1,3,3,4,3,2,4,2};
//         int[] nums4 = new int[] {1,1};
//         int[] nums5 = new int[] {2,14,18,22,22};
//         DuplicateChecker dupChecker = new DuplicateChecker();
//         System.out.println(dupChecker.checkDuplicates(nums1));
//         System.out.println(dupChecker.checkDuplicates(nums2));
//         System.out.println(dupChecker.checkDuplicates(nums3));
//         System.out.println(dupChecker.checkDuplicates(nums4));
//         System.out.println(dupChecker.checkDuplicates(nums5));
//         int [] a = {-1, -3, -3, -1, -2, -1, -5, -3,-12};
//         MaxSubArray maxSubArray = new MaxSubArray();
//         System.out.println(maxSubArray.maxSubArray(a));
//         maxSubArray.maxSubArray(nums2);
//         maxSubArray.maxSubArray(nums3);
//         maxSubArray.maxSubArray(nums4);
//         maxSubArray.maxSubArray(nums5);

//         int[] mergedSortedArray1 = new int[]{1,2,3,0,0,0};
//         int[] mergedSortedArray2 = new int[]{2,5,6};
//         int[] mergedSortedArray3 = new int[]{0};
//         int[] mergedSortedArray4 = new int[]{1};
//
//         MergeSortedArray mergedSort = new MergeSortedArray();
//         mergedSort.merge(mergedSortedArray1,3,mergedSortedArray2,3);
//         System.out.print("[");
//         for(int i=0;i<mergedSortedArray1.length;i++){
//           System.out.print(" "+mergedSortedArray1[i]+" ");
//         }

//        int[] nums = new int[]{1, 2, 1};
//        int[] nums2 = new int[]{1,3,2,1};
//        ArrayConcatenation concatenation = new ArrayConcatenation();
//        int[] solution = concatenation.getConcatenation(nums);
//        printArray(solution);
//                printArray(concatenation.getConcatenation(nums));
        //        printArray(concatenation.getConcatenation(nums2));


//        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
//        int[] nums2 = new int[]{5, 0, 1, 2, 3, 4};
//        ArrayFromPermutation permutation = new ArrayFromPermutation();
//        printArray(permutation.buildArray(nums));
//        System.out.println("");
//        printArray(permutation.buildArray(nums2));


//        int[] nums = new int[]{1, 2, 3, 4};
//        int[] nums2 = new int[]{1,1,1,1,1};
//        int[] nums3 = new int[]{3,1,2,10,1};
//        SumOf1DArray sum = new SumOf1DArray();
//        printArray(sum.runningSum(nums));
//        System.out.println("");
//        printArray(sum.runningSum(nums2));
//        System.out.println("");
//        printArray(sum.runningSum(nums3));
//        System.out.println("");

//        int[][] accounts1 = new int[][]{{1, 2, 3}, {3, 2, 1}};
//        int[][] accounts2 = new int[][]{{1, 5},{7, 3},{3, 5}};
//        int[][] accounts3 = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
//        RichestCustomerWealth customerWealth = new RichestCustomerWealth();
//        System.out.println(customerWealth.maximumWealth(accounts1));
//        System.out.println(customerWealth.maximumWealth(accounts2));
//        System.out.println(customerWealth.maximumWealth(accounts3));

//        ArrayShuffle arrayShuffle = new ArrayShuffle();
//        int[] nums = new int[]{2,5,1,3,4,7};
//        int[] nums2 = new int[]{1,2,3,4,4,3,2,1};
//        int[] nums3 = new int[]{1,1,2,2};
//        printArray(arrayShuffle.shuffle(nums,3));
//        System.out.println("");
//        printArray(arrayShuffle.shuffle(nums2,4));
//        System.out.println("");
//        printArray(arrayShuffle.shuffle(nums3,2));

//        int[] candies = new int[]{2,3,5,1,3};
//        int[] candies2 = new int[]{4,2,1,1,2};
//        int[] candies3 = new int[]{12,1,12};
//        GreatestNumberOfCandies greatestNumberOfCandies = new GreatestNumberOfCandies();
//        greatestNumberOfCandies.kidsWithCandies(candies,3).forEach(i->System.out.print(i));
//        System.out.println("");
//        greatestNumberOfCandies.kidsWithCandies(candies2,1).forEach(i->System.out.print(i));
//        System.out.println("");
//        greatestNumberOfCandies.kidsWithCandies(candies3,10).forEach(i->System.out.print(i));


//        int[] nums = new int[]{1,2,3,1,1,3};
//        int[] nums2 = new int[]{1,1,1,1};
//        int[] nums3 = new int[]{1,2,3};
//        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
//        System.out.println(goodPairs.numIdenticalPairs(nums));
//        System.out.println(goodPairs.numIdenticalPairs(nums2));
//        System.out.println(goodPairs.numIdenticalPairs(nums3));


//        int[] nums = new int[]{8,1,2,2,3};
//        int[] nums2 = new int[]{6,5,4,8};
//        int[] nums3 = new int[]{7,7,7,7};
//        SmallerThanCurrentNumber smallerThanCurrentNumber = new SmallerThanCurrentNumber();
//        printArray(smallerThanCurrentNumber.smallerNumbersThanCurrent(nums));
//        System.out.println("");
//        printArray(smallerThanCurrentNumber.smallerNumbersThanCurrent(nums2));
//        System.out.println("");
//        printArray(smallerThanCurrentNumber.smallerNumbersThanCurrent(nums3));
//        System.out.println("");

//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence2 = "leetcode";
//        Pangram pangram = new Pangram();
//        System.out.println(pangram.checkIfPangram(sentence));
//        System.out.println(pangram.checkIfPangram(sentence2));


        int[] nums = new int []{0, 1, 2, 3, 4};
        int[] numsIndx = new int []{0,1,2,2,1};
        int[] nums2 = new int []{1,2,3,4,0};
        int[] numsIndx2 = new int []{0,1,2,3,0};
        int[] nums3 = new int []{1};
        int[] numsIndx3 = new int []{0};
        CreateTargetArray createTargetArray = new CreateTargetArray();
        printArray(createTargetArray.createTargetArray(nums,numsIndx));
        System.out.println();
        printArray(createTargetArray.createTargetArray(nums2,numsIndx2));
        System.out.println();
        printArray(createTargetArray.createTargetArray(nums3,numsIndx3));


    }
}
