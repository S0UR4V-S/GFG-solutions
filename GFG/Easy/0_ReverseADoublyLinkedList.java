/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp1=head;
        while(temp1.next!=null)
            temp1=temp1.next;
            
        Node ans=new Node(temp1.data);
        Node temp=ans;
        while(temp1.prev!=null){
            Node newnode=new Node(temp1.prev.data);
            temp.next=newnode;
            newnode.prev=temp;
            temp=temp.next;
            temp1=temp1.prev;
        }
        return ans;
    }
}
