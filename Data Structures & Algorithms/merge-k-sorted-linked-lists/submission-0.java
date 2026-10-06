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
    public ListNode mergeKLists(ListNode[] lists) {
        //create a priority queue for minimum heap
        PriorityQueue<ListNode> pq = 
        new PriorityQueue<>((a,b) -> Integer.compare(a.val,b.val));
        //fill this with first elements of each ll
        for(ListNode l:lists){
            if(l!=null)
            pq.add(l);
        }
        //createa a dummy node
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        // while pq has elements , we need to
        //take smallest, wire it to dummy ll
        // remove from pq
        // add next element from that LL into Pq
        while(!pq.isEmpty()){
            ListNode n = pq.poll();
            curr.next = n;
            if(n.next!=null) pq.add(n.next);
           
            curr = curr.next;
        }
        return dummy.next;
    }
}
