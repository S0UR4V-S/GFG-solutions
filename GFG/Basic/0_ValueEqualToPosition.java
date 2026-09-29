/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1)
                ans.add(i+1);
        }
        return ans;
    }
}

