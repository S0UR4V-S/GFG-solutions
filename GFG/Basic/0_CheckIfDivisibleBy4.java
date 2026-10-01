/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-divisible-by-43813/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    boolean divisibleBy4(String s) {
        // code here
        int ans=0;
        if(s.length()>=2){
        String temp=new String();
        temp+=s.charAt(s.length()-2); 
        temp+=s.charAt(s.length()-1);
        ans=Integer.parseInt(temp);
        } 
        else
        ans=Integer.parseInt(s);
        
        // System.out.print(ans);
        
        if(ans%4==0){
            return true;
        }
        return false;
    }
}
