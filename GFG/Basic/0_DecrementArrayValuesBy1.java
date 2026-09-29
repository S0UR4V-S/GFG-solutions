/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/decrement-array-values/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int[] decrementArray(int[] arr, int n) {
        // code here
        for(int i=0;i<arr.length;i++){
            arr[i]-=1;
        }
        return arr;
    }
}
