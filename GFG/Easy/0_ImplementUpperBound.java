/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-upper-bound/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        // if(arr[arr.length-1]>target)
        //     return arr.length;
        int ans=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                ans=i;
                break;
            }
            else
                ans=arr.length;
        }
        return ans;
    }
}

