/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-spaces0128/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public String removeSpaces(String s) {
        // code here
        String ans=new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){}
            
            else
                ans+=s.charAt(i);
    }
    return ans;
}
}
