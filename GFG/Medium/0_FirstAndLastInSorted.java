/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(-1);
        ans.add(-1);
        int s=0;
        int e=arr.length-1;
        while( s<arr.length){
            if(arr[s]==x){
                ans.set(0,s);
                break;
            }
            else
                ans.set(0,-1);
            
            s++;
        }
        while( e>=0){
            if(arr[e]==x){
                ans.set(1,e);
                break;
            }
            else
                ans.set(1,-1);
            e--;
        }
        return ans;
    }
}

