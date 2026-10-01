/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/for-loop-2/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static void utility(String s) {
        // code here
        String ans=new String();
        for(int i=0;i<s.length();i++){
            if(i%2==0)
            ans+=s.charAt(i);
        }
        System.out.print(ans);
    }
}
