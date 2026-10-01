/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/elements-in-the-range2834/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class Solution {
	public boolean checkElements(int start, int end, int[] arr) {
		// code here
		int n = arr.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i<n; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		for (int i = start; i <= end; i++) {
		    
			if(hm.containsKey(i)){}
			else
			    return false;
		}
		
		return true;
		
	}
}

