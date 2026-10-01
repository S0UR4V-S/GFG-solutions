/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-string1818/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    Boolean allCharactersSame(String s) {
        // code here
        char a=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=a)  
                return false;
        }
        return true;
    }
}
