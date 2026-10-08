/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/array-traversal-reverse/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
	public static void arrayTraversalReverse(int[] arr, int n) {
		// Code here
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}

