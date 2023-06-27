package leet.code.Problems.Arrays.easy;

/*
Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class UniqueIntegersSum {
    public static void printArray(int[] nums) {
        IntStream list = Arrays.stream(nums);
        list.forEach(i -> System.out.print(i + " "));
    }
    public int[] sumZero(int n) {
        int[] response = new int[n];
        int counter=1;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                response[i]=counter;
                response[n-i-1]=0-counter;
                counter++;
            }
        }else{
            response[n/2]=0;
            for(int i=0;i<n/2;i++){
                response[i]=counter;
                response[n-i-1]=0-counter;
                counter++;
            }
        }

        return  response;
    }

    public static void main(String[] args) {
        UniqueIntegersSum uniqueIntegersSum = new UniqueIntegersSum();
//        printArray(uniqueIntegersSum.sumZero(5));
//        printArray(uniqueIntegersSum.sumZero(3));
        printArray(uniqueIntegersSum.sumZero(1));
        printArray(uniqueIntegersSum.sumZero(4));
    }
}
