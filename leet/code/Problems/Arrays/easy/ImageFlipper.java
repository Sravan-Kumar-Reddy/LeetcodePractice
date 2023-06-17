package leet.code.Problems.Arrays.easy;

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
*/

public class ImageFlipper {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length ];
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1;j>=0;j--){
                ans[i][image[i].length-1-j] = image[i][j];
            }
            for(int j=0;j<ans[i].length;j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }else{
                    ans[i][j]=0;
                }
            }
        }

        return ans;
    }
}

/*
Memory Optimized Solution
*/

//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//
//        int[][] output = new int[image.length][image.length];
//
//        for(int row = 0; row < image.length; row++)
//        {
//            int newCol = 0;
//
//            for(int col = image[row].length - 1; col >=0; col--)
//            {
//                output[row][newCol] = 1 - image[row][col];
//                newCol++;
//            }
//        }
//        System.gc();
//        return output;
//    }
//}
