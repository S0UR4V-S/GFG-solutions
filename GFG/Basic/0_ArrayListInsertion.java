/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/arraylist-insertion/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
