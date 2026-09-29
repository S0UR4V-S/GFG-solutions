/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/missing-number-in-shuffled-array0938/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        // code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        while( count<arr1.length-1){
            if(arr1[count]!=arr2[count]){
                return arr1[count];
            }
            count++;
        }
        return arr1[count];
    }
}
