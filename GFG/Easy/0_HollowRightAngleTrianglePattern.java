/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/right-angle-triangle-2-1605689820--102106/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i||i==n){
                    System.out.print("* ");
                }
                else 
                    System.out.print("  ");
            }
                System.out.println();
        }
    }
}
