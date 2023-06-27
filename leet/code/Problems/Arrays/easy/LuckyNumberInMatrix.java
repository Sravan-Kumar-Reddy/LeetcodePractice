package leet.code.Problems.Arrays.easy;

/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {

    public int minInRow(int[][] matrix,int row){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix[row].length;i++){
            if(min>matrix[row][i]){
                min=matrix[row][i];
            }
        }
        return min;
    }
    public int maxInCol(int[][] matrix,int col){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            if(max<matrix[i][col]){
                max=matrix[i][col];
            }
        }
        return max;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> response = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(minInRow(matrix,i)==maxInCol(matrix,j)){
                    response.add(matrix[i][j]);
                }
            }
        }
        return response;
    }

    public static void main(String[] args) {
        LuckyNumberInMatrix luckyNumberInMatrix = new LuckyNumberInMatrix();
//        List<Integer> response = luckyNumberInMatrix.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});
//        List<Integer> response = luckyNumberInMatrix.luckyNumbers(new int[][]{{1,10,4,2}, {9,3,8,7}, {15,16,17,12}});
        List<Integer> response = luckyNumberInMatrix.luckyNumbers(new int[][]{{7,8},{1,2}});

        for(int i=0;i<response.size();i++){
            System.out.print(response.get(i));
            System.out.print(" ");
        }
    }
}


/*
Runtime Optimized
*/

//class Solution {
//    public List<Integer> luckyNumbers (int[][] matrix) {
//        List<Integer> arr=new ArrayList<Integer>();
//        for(int i=0;i<matrix.length;i++)
//        {
//            int minIndex=minInRow(matrix,i);
//            int value=matrix[i][minIndex];
//            if(maxInCol(value,minIndex,matrix))
//                arr.add(matrix[i][minIndex]);
//        }
//        return arr;
//    }
//
//    private int minInRow(int[][] matrix,int Index)
//    {
//        int min=matrix[Index][0],minIndex=0;
//        for(int i=1;i<matrix[Index].length;i++)
//        {
//            if(min>matrix[Index][i])
//            {
//                min=matrix[Index][i];
//                minIndex=i;
//            }
//        }
//        return minIndex;
//    }
//
//    private boolean maxInCol(int value,int Index,int[][] matrix)
//    {
//        for(int i=0;i<matrix.length;i++)
//        {
//            if(value<matrix[i][Index])
//                return false;
//        }
//        return true;
//    }
//}
