/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/last-index-of-15847/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int lastIndex(String s) {
        // code here
        int ans=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                ans=i;
        }
        return ans;
    }
}
