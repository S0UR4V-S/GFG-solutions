/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if(head.next==null)
            return head;
        Node temp=head;
               while(temp.next!=null){
                   if(temp.data==temp.next.data){
                      temp.next=temp.next.next;
                   }
                   else
                   temp=temp.next;
               }
              return head;
    }
}
