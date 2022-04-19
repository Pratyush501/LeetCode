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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode front = null;
        ListNode rear = null;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list2.val<=list1.val)
        {
            front=rear=list2;
            list2=list2.next;
        }
        else
            {
                front=rear=list1;
                list1=list1.next;
            }
        
        while(list1!=null && list2!=null)
        {
            if(list2.val<=list1.val)
            {
                rear.next=list2;
                rear=rear.next;
                list2=list2.next;
            }
            else{
                rear.next=list1;
                rear=rear.next;
                list1=list1.next;
            }
        }
        
        while(list1!=null)
        {
            rear.next=list1;
                rear=rear.next;
                list1=list1.next;
        }
        while(list2!=null)
        {
            rear.next=list2;
                rear=rear.next;
                list2=list2.next;   
        }
        
        return front;
    }
}