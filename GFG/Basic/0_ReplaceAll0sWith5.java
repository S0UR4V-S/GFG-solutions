/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0)
            return 5;
        int ans=0;
        int place=1;
        while(n>0){
            if(n%10==0)
                ans+=5*place;
            else
            ans+=(n%10)*place;
            place*=10;
            n/=10;
                
        }
        return ans;
    }
}

