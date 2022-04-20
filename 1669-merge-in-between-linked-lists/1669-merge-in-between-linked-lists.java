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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        int count = 0;
        int count2 = 0;
        ListNode curr = list1;
        
        while(count<=b)
        {
            temp=temp.next;
            count++;
        }
        while(curr.next!=null)
        {
            if(count2==a-1)
                curr.next=list2;
            else
                curr=curr.next;
            count2++;
        }
        curr.next=temp;
        return list1;
    }
}