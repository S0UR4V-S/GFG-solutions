/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence4613/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    public int findDiff(int[] arr) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int min=1000000000;
        int max=0;
        for(HashMap.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>max)
                max=e.getValue();
            if(e.getValue()<min)
                min=e.getValue();
        }
        if(hm.size()==1)
            return 0;
        
        return max-min;
    }
}
