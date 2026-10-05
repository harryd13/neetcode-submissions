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
        int carry = 0;
        ListNode dummy = new ListNode(0);// -1 -> 
        ListNode t = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;

        while(t1!=null || t2!=null){
            int sum = carry + ((t1!=null)? t1.val:0) + ((t2!=null)? t2.val:0) ;
            ListNode n = new ListNode(sum%10);
            carry = sum/10;
            t.next = n;
            t = t.next;
            if(t1!=null)t1 = t1.next;
            if(t2!=null)t2 = t2.next;
            
        }
        if(carry == 1)
        {
            ListNode n = new ListNode(1);
            n.next = null;
            t.next = n;

        }
        return dummy.next;

    }
}
