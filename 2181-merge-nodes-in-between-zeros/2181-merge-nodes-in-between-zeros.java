/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode front = new ListNode(0);
        ListNode rear = front;
        ListNode curr = head;
        int sum=0;
        while(curr.next!=null)
        {
            if(curr.val==0)
                curr=curr.next;
            while(curr.val!=0)
            {
                sum=sum+curr.val;
                curr=curr.next;
            }
            ListNode temp  = new ListNode(sum);
            rear.next=temp;
            rear=rear.next;
            sum=0;
        }
        return front.next;
    }
}