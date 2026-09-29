/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/linked-list-of-strings-forms-a-palindrome/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Node Structure
class Node {
    String data;
    Node next;
    Node(String x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public boolean compute(Node head) {
        // code here
        boolean ans=false;
        Node temp=head;
        String s="";
        while(temp!=null){
            s+=temp.data;
            temp=temp.next;
        }
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                ans=true;
            }
            else
                return false;
            i++;
            j--;
        }
            
        return ans;
        }
    }

