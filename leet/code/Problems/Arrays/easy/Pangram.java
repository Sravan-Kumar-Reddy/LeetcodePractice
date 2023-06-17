package leet.code.Problems.Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.


Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        List<Character> alphabets = new ArrayList<Character>();
        for(char c='A';c<='Z';c++){
            alphabets.add(c);
        }
        List sentenceList = new ArrayList();
        for(int i=0;i<sentence.length();i++){
            sentenceList.add(sentence.toUpperCase().charAt(i));
        }
        for(char c:alphabets){
            if(!sentenceList.contains(c)){
                return false;
            }
        }
        return true;
    }
}


/*
Runtime Optimized Solution
*/

//class Solution {
//    public  Boolean checkIfPangram(String sentence){
//        for (char i = 'a'; i <='z' ; i++) {
//            if(sentence.indexOf(i) == -1){
//                return false;
//            }
//        }
//        return true;
//    }
//}


/*
Memory optimized Solution
*/

//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        boolean status=false;
//        System.out.println(sentence.length());
//        if(sentence.length()>=26){
//
//            for(char a='a';a<='z';a++){
//                if(	sentence.indexOf(a)==-1) {
//                    status= false;
//                    break;
//                }
//                else if(sentence.indexOf(a)!=-1) {
//                    status= true;
//                }
//
//
//            }
//
//
//        }
//        return status;
//    }
//}