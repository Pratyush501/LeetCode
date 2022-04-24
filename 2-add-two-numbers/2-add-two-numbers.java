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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode temp = new ListNode(0);
        ListNode trv = temp;
        if(l1.next==null && l2.next==null && l1.val==0 && l2.val==0)
           {
               return l1;
           }
        int a=0;
        int carry=0;
        while(curr1!=null && curr2!=null)
        {
            a=carry+curr1.val + curr2.val;
            if(a<10)
            {
                ListNode temp2 = new ListNode(a);
                trv.next = temp2;
                trv=trv.next;
                curr1=curr1.next;
                curr2=curr2.next;
                carry=0;
            }
            else
            {
                carry = a/10;
                int b = a%10;
                ListNode temp3 = new ListNode(b);
                trv.next = temp3;
                trv = trv.next;
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }
        while(curr1!=null)
        {
            a = carry + curr1.val;
            if(a<10)
            {
                ListNode temp4 = new ListNode(a);
                trv.next=temp4;
                trv=trv.next;
                curr1=curr1.next;
                carry=0;
            }
            else
            {
                carry = a/10;
                int b = a%10;
                ListNode temp5 = new ListNode(b);
                trv.next = temp5;
                trv =trv.next;
                curr1=curr1.next;
            }
        }
        
        
        
        
        while(curr2!=null)
        {
            a = carry + curr2.val;
            if(a<10)
            {
                ListNode temp7 = new ListNode(a);
                trv.next=temp7;
                trv=trv.next;
                curr2=curr2.next;
                carry=0;
            }
            else
            {
                carry = a/10;
                int b = a%10;
                ListNode temp8 = new ListNode(b);
                trv.next = temp8;
                trv =trv.next;
                curr2=curr2.next;
            }
        }
        
        
        if(carry!=0)
        {
            ListNode temp9 = new ListNode(carry);
            trv.next=temp9;
            trv=trv.next;
        }
        
        return temp.next;
        
        
    }
}