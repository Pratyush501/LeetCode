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
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode curr =  head;
        int cnt=0;
        int sum=0;
        while(curr!=null)
        {
            arr.add(curr.val);
            curr=curr.next;
            cnt++;
        }
        for(int i=0;i<cnt/2;i++)
        {
            if(arr.get(i)+arr.get(cnt-i-1)>sum)
                sum=arr.get(i)+arr.get(cnt-i-1);
        }
        return sum;
        
    }
}