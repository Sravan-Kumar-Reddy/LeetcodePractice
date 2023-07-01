package leet.code.Problems.Arrays.easy;

/*
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.



Example 1:


Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.
Example 2:


Input: position = [2,2,2,3,3]
Output: 2
Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.
Example 3:

Input: position = [1,1000000000]
Output: 1
*/

import java.util.LinkedHashMap;

public class MinCostToMoveChips {
    public int minCostToMoveChips(int[] chips) {
        int[] count = new int[2];

        for (int chip : chips)
            ++count[chip % 2];

        return Math.min(count[0], count[1]);
    }

    public static void main(String[] args) {
        MinCostToMoveChips moveChips = new MinCostToMoveChips();
//        System.out.println(moveChips.minCostToMoveChips(new int[]{1,2,3}));
//        System.out.println();
//        System.out.println(moveChips.minCostToMoveChips(new int[]{1,1000000000}));
//        System.out.println();
//        System.out.println(moveChips.minCostToMoveChips(new int[]{2,3,3}));
//        System.out.println();
//        System.out.println(moveChips.minCostToMoveChips(new int[]{2,2,2,3,3}));
//        System.out.println();
        System.out.println(moveChips.minCostToMoveChips(new int[]{6, 4, 7, 8, 2, 10, 2, 7, 9, 7}));
    }
}


/*
Solution
*/

//    public int minCostToMoveChips(int[] chips) {
//        int[] count = new int[2];
//
//        for (int chip : chips)
//            ++count[chip % 2];
//
//        return Math.min(count[0], count[1]);
//    }