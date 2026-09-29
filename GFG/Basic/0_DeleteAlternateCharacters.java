/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static String delAlternate(String s) {
        // code here
        String r=new String();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                r+=s.charAt(i);
            }
        }
        return r;
    }
}
