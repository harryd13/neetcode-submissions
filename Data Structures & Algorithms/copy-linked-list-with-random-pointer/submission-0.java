/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // add new nodes 
        Node curr = head;
        while(curr != null){
            Node l = new Node(curr.val);
            l.next = curr.next;
            curr.next = l;
            curr = curr.next.next;
        }
        curr = head;
        while(curr !=null){
            curr.next.random = (curr.random == null) ? null : curr.random.next;
            curr = curr.next.next;
        }
        // seperate

        Node dummy = new Node(-1);
        Node temp = dummy;
        curr = head;

        while(curr != null){
            temp.next = curr.next;
            curr.next = temp.next.next;
            curr = curr.next;
            temp = temp.next;
        }

        return dummy.next;

    }
}
