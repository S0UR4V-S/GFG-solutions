/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/binary-search-on-arraylist/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int s=0;
        int e=list.size()-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            
            if(k==list.get(mid))
                return mid;
            else if(k<list.get(mid))
                e=mid-1;
            else
                s=mid+1;
        }
        return -1;

        // If k in arr return 1, else return -1
    }
}
