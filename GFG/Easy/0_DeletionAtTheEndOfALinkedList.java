/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/deletion-at-the-end-of-a-linked-list/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

/* Linked List Node Structure
class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = next;
	}
}
*/

class Solution {
	public Node removeLastNode(Node head) {
		// code here
		if (head.next == null)
			return head.next;
		else if (head.next.next == null) {
			head.next = head.next.next;
			return head;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}
}

