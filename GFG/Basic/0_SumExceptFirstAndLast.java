/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/max-length-chain/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int sum=0;
        for(int i=1;i<arr.length-1;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
