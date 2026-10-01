/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-for-binary/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public boolean isBinary(String s) {
        // code here
        boolean ans=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' || s.charAt(i)=='0'){
                ans=true;
            }
            else
                return false;
        }
        return ans;
    }
}
