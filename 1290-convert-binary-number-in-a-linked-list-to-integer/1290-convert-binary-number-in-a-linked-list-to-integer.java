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
    public int getDecimalValue(ListNode head) {
        int a=1;
        int sum=0;
        ListNode curr = head;
        ListNode prev = null;
        ArrayList<Integer> arr = new ArrayList<Integer>();int count=-1;
 	    while(curr!=null)
 	    {
            arr.add(curr.val);
            count++;
            curr=curr.next;
 	    }
        for(int i=count;i>=0;i--)
 	    {
 	        sum+=arr.remove(i)*a;
 	        a*=2;
 	    }
        return sum;
    }
}