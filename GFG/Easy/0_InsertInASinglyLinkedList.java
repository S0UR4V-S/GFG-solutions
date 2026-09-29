/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/insertion-at-a-given-position-in-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        
        Node temp=head;
        Node newnode=new Node(val);
        if(pos==1){
            newnode.next=head;
            return newnode;
        }
        pos-=2;
        while(pos>0 && temp.next!=null){
            temp=temp.next;
            pos--;
        }
        if(temp==null){
            temp=newnode;
        }
        else if(temp.next==null)
            temp.next=newnode;
        else{
        newnode.next=temp.next;
        temp.next=newnode;
        }
        return head;
    }
}
