/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/count-squares3649/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static int countSquares(int n) {
        // code here
        int ans=0;
        int count=1;
        while(count*count<n){
            if(count*count<n)
            ans++;
            count++;
        }
        return ans;
    }
}
