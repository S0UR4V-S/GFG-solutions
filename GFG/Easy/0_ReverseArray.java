/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-an-array/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        for(int i=0;i<arr.length/2;i++){
            int t=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=t;
        }
    }
}
