package leet.code.Problems.Arrays.easy;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
[1,2,3,1,2,3]
*/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for(int i=0;i<m;i++){
            temp[i] = nums1[i];
        }
        int i=0,j=0;
        int counter = 0;
        while((i<m)&&(j<n)){
            if(temp[i]<=nums2[j]){
                nums1[counter] = temp[i];
                i++;
                counter++;
            }else{
                nums1[counter] = nums2[j];
                j++;
                counter++;
            }
        }
        while(i<m) {
            nums1[counter] = temp[i];
            i++;
            counter++;
        }
        while(j<n){
            nums1[counter] = nums2[j];
            j++;
            counter++;
        }
    }
}
