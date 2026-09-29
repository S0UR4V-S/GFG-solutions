/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/print-an-array-in-pendulum-arrangement4004/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public int[] pendulumArrangement(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int[] ans=new int[arr.length];
        int mid=0;
        if(n%2==0){
            mid=(n-1)/2;
            ans[mid]=arr[0];
        }
        else{
            mid=n/2;
            ans[mid]=arr[0];
        }
            
        int t=1;
        int count=1;
        float temp=1;
        while(count<n){
            if(t%2!=0){
                ans[mid+(int)temp]=arr[count];
            }
            else{
                ans[mid-(int)temp]=arr[count];
            }
            count++;
            t++;
            temp+=0.5;
        }
        return ans;
    }
}
