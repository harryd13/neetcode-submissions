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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode groupPrev = dummy;
        while(true){
            //find kth node
            ListNode kth = groupPrev;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            // Not enough nodes for another full group.
            if (kth == null) {
                break;
            }
             // 2. Save the boundaries before changing links.
            ListNode groupNext = kth.next;
            ListNode oldHead = groupPrev.next;

            // 3. Reverse this group.
            ListNode prev = groupNext;
            ListNode curr = oldHead;

            while (curr != groupNext) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            groupPrev.next = kth;
            groupPrev = oldHead;
        }
        return dummy.next;
        
    }
    
}
