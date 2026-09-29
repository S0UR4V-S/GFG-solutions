/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/java-loops-set-11726/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int e=0;
        int o=0;
        for(int i=1;i<=N;i++){
            if(i%2==0)
                e+=i;
            else 
            o+=i;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(e);
        ans.add(o);
        return ans;
    }
}
