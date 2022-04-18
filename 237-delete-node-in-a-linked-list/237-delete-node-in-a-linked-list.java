/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode prev = node;
        while(curr.next!=null)
        {
            prev = curr;
            ListNode temp = curr.next;
            curr.val=temp.val;
            curr=temp;
        }
        prev.next=null;
        
        
    }
}