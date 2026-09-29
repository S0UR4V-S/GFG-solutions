/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-distinct-elements--130928/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int countDistinct(int arr[]) {
        // code here
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i],i);
        }
        
        return ans.size();
    }
}
