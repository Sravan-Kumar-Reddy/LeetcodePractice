package leet.code.Problems.Arrays.easy;

/*
Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.


Example 1:

Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

Example 2:
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.

Example 3:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
*/

import javax.xml.bind.annotation.XmlAttribute;
import java.security.Principal;

public class MatrixRotation{
     public int[][] invertMatrix(int[][] mat){
         int[][] inverseMat = new int[mat.length][mat.length];
         for(int i=0;i<mat.length;i++){
             for(int j=0;j<mat.length;j++){
                 inverseMat[i][j] = mat[j][mat.length-1-i];
             }
         }
         return inverseMat;
     }

     public boolean matrixComparison(int[][] mat, int[][] target){
        if(mat.length==target.length&&mat[0].length==target[0].length){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    if(mat[i][j]!=target[i][j]){
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
         if(matrixComparison(mat,target)){
             return true;
         }
        for(int counter=0;counter<3;counter++){
            int[][] inverseMat = invertMatrix(mat);
            if(matrixComparison(inverseMat,target)){
                return true;
            }
            mat = inverseMat;
        }
        return false;
    }

    public static void main(String[] args) {
        MatrixRotation matrixRotation = new MatrixRotation();
//        System.out.println(matrixRotation.findRotation(new int[][]{{0,1},{1,0}},new int[][]{{1,0},{0,1}}));
        System.out.println(matrixRotation.findRotation(new int[][]{{0,0,0},{0,1,0},{1,1,1}},new int[][]{{1,1,1},{0,1,0},{0,0,0}}));
    }
}
