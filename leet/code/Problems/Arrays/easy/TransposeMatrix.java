package leet.code.Problems.Arrays.easy;

/*
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/

import java.util.ArrayList;
import java.util.List;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int [][]ans = new int[colLength][rowLength];
        List<Integer> matrixElements = new ArrayList();
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                matrixElements.add(matrix[i][j]);
            }
        }
        int counter=0;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                ans[j][i] = matrixElements.get(counter++);
            }
        }
        return ans;
    }
}


/*
Memory Optimized Solution
*/
//public int[][] transpose(int[][] matrix) {
//    int [][] arr = new int[matrix[0].length][matrix.length];
//    for(int i=0;i<matrix.length;i++){
//        for(int j= 0 ;j<matrix[i].length;j++){
//            arr[j][i] = matrix[i][j];
//        }
//    }
//    System.gc();
//    return arr;
//}
