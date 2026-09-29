/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k)
                return true;
            else if(arr[mid]<k)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}
