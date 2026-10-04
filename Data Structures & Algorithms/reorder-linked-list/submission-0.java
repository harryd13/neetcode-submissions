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
    public void reorderList(ListNode head) {
        // break the list 
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // one part is head till slow.
        // another part is slow.next to end.
        // reverse second part
        ListNode h2 = slow.next;// get head
        slow.next = null; //break the first list

        ListNode curr = h2;
        ListNode prev = null;
        while(curr!=null){
            h2 = curr.next;
            curr.next = prev;
            prev= curr;
            curr = h2;

        }
        // prev is head of second list
        // merge these list
        int flag = 0;
        ListNode dummy = new ListNode(0);
        curr = dummy;
        while(head!=null && prev!=null){
            if(flag == 0){
                curr.next = head;
                head = head.next;
                flag = 1;
            }else{
                curr.next = prev;
                prev = prev.next;
                flag = 0;
            }
            curr = curr.next;
        }
        if(head == null)curr.next = prev;
        else curr.next = head;

        head = dummy.next;

    }
}
