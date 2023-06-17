package leet.code.Problems.Arrays.easy;

/*
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population
if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.


Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
*/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MaxPopulationInYear {
//    public int maximumPopulation(int[][] logs) {
//        int maxYear=0;
//        List<Integer> yearList = new ArrayList();
//        LinkedHashMap<Integer,Integer> map = new LinkedHashMap();
//        for(int i=0;i<logs.length;i++){
//            int birthYear = logs[i][0];
//            yearList.add(birthYear);
//            map.put(birthYear,0);
//        }
//        for(int j=0;j<yearList.size();j++){
//            int year = yearList.get(j);
//            maxYear = year;
//            for(int i=0;i<logs.length;i++){
//                int birthYear = logs[i][0];
//                int deathYear = logs[i][1];
//                if(year>=birthYear&&year<deathYear-1){
//                    map.put(birthYear,map.get(birthYear)+1);
//                }
//            }
//        }
//
//        return maxYear;
//    }

    public int maximumPopulation(int[][] logs) {

        int[] year = new int[2051];

        // O(n) -> n is log.length

        for (int[] log : logs) {

            year[log[0]] += 1;
            year[log[1]] -= 1;
        }

        int maxNum = year[1950], maxYear = 1950;

        // O(100) -> 2050 - 1950 = 100

        for (int i = 1951; i < year.length; i++) {
            year[i] += year[i - 1];  // Generating Prefix Sum

            if (year[i] > maxNum) {
                maxNum = year[i];
                maxYear = i;
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
        MaxPopulationInYear maxPopulationInYear = new MaxPopulationInYear();
        System.out.println(maxPopulationInYear.maximumPopulation(new int[][]{{1993, 1999}, {2000, 2010}}));
    }
}


/*

 */

//    public int maximumPopulation(int[][] logs) {
//
//        int[] year = new int[2051];
//
//        // O(n) -> n is log.length
//
//        for(int[] log : logs){
//
//            year[log[0]] += 1;
//            year[log[1]] -= 1;
//        }
//
//        int maxNum = year[1950], maxYear = 1950;
//
//        // O(100) -> 2050 - 1950 = 100
//
//        for(int i = 1951; i < year.length; i++){
//            year[i] += year[i - 1];  // Generating Prefix Sum
//
//            if(year[i] > maxNum){
//                maxNum = year[i];
//                maxYear = i;
//            }
//        }
//
//        return maxYear;
//    }