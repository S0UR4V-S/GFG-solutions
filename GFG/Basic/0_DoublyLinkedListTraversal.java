/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/display-doubly-linked-list--154650/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<Integer> arr=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        Node temp=head;
        while(temp.next!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        arr.add(temp.data);

        while(temp.prev!=null){
            arr2.add(temp.data);
            temp=temp.prev;
        }
        arr2.add(temp.data);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(arr);
        ans.add(arr2);
        return ans;
        
    }
}
