/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/max-and-min-in-arraylist/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // code here
        int max=0;
        for(int i=0;i<arr.size();i++){
            if(max<arr.get(i))
                max=arr.get(i);
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        // code here.
        int min=1000000;
        for(int i=0;i<arr.size();i++){
            if(min>arr.get(i))
                min=arr.get(i);
        }
        return min;
    }
}

