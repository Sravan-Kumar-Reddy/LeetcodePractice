package leet.code.Problems.Arrays.easy;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class PlusOne {
    public static void printArray(int[] nums) {
        IntStream list = Arrays.stream(nums);
        list.forEach(i -> System.out.print(i + " "));
    }
    public int[] plusOne(int[] digits) {
        int sum=1;
        LinkedList<Integer> list = new LinkedList<>();
        int n = digits.length - 1;
        while (n >= 0 || sum != 0) {
            if (n >= 0) {
                sum += digits[n];
                n--;
            }
            list.addFirst(sum % 10);
            sum /= 10;
        }
        int[] response = new int[list.size()];
        for(int i=0;i<list.size();i++){
            response[i]=list.get(i);
        }
        return response;
    }

    public static void main(String[] args) {
        PlusOne one = new PlusOne();
//        printArray(one.plusOne(new  int[]{1,2,3}));
//        printArray(one.plusOne(new  int[]{4,3,2,1}));
//        printArray(one.plusOne(new  int[]{9}));
        printArray(one.plusOne(new  int[]{9,8,7,6,5,4,3,2,1,0}));
    }
}
