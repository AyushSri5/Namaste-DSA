// Brute Force TC: O(n) SC: O(n)
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;

        ListNode curr=head;
        while(curr!=null){
            if(curr.val!=val){
                result.next=new ListNode(curr.val);
                result=result.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        
        ListNode curr=head;
        ListNode prev=dummy;

        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return dummy.next;
        
    }
}
// Optimised approach 2 TC: O(n) SC: O(1)
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                // Here cannot move cur to cur.next as we need to validate the next node.
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
