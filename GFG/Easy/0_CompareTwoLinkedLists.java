/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/compare-two-linked-lists/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/*  Structure of Node
class Node
 {
    char data;
    Node next;

    // Constructor to create a new node
    Node(char d)
    {
       data = d;
       next = null;
    }
 }*/

class Solution {
    int compare(Node head1, Node head2) {
        // Your code here
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data==temp2.data){
                
            }
            else if(temp1.data>temp2.data){
                return 1;
            }
            else{
                return -1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1==null && temp2!=null)
            return -1;
        else if(temp2==null && temp1!=null)
            return 1;
        return 0;
    }
}
