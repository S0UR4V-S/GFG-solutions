/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int largest(int[] arr) {
        // code here
        int f=arr[0];
        for(int i=0;i<arr.length;i++){
            if (f<arr[i])
            f=arr[i];
        }
        return f;
    }
}

