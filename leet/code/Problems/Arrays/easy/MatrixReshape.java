package leet.code.Problems.Arrays.easy;

/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.



Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
*/

import java.util.ArrayList;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rowLength = mat.length;
        int colLength = mat[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int[][] response = new int[r][c];
        if(rowLength*colLength==r*c){
            for(int i=0;i<rowLength;i++){
                for(int j=0;j<colLength;j++){
                    list.add(mat[i][j]);
                }
            }
            int counter=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    response[i][j]=list.get(counter);
                    counter++;
                }
            }
        }else{
            return mat;
        }
        return response;
    }

    public static void main(String[] args) {
        MatrixReshape matrixReshape = new MatrixReshape();
        matrixReshape.matrixReshape(new int[][]{{1,2},{3,4}},1,4);
//        matrixReshape.matrixReshape(new int[][]{{1,2},{3,4}},2,3);
    }
}

/*
Memory Optimized Solution
*/
//class Solution {
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        int[][] ans = new int[r][c];
//        if (r*c == mat.length * mat[0].length){
//            int x = 0, y=0;
//            for (int i = 0 ;  i < mat.length; i++){
//                for (int j = 0; j < mat[i].length ; j++){
//                    ans[x][y] = mat[i][j];
//                    y++;
//                    if (y == c){
//                        x++;
//                        y=0;
//                    }
//                }
//            }
//            System.gc();
//            return ans;
//        }
//        else{
//            System.gc();
//            return mat;
//        }
//
//
//    }
//}