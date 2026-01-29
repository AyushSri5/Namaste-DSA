// Brute Force TC: O(n) SC: O(1)
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode prev=head;
        ListNode curr=head.next;

        while(curr!=null){
            int temp=prev.val;
            prev.val=curr.val;
            curr.val=temp;
            if(curr.next==null)
            break;
            prev=curr.next;
            curr=curr.next.next;
        }
        return head;
    }
}
// Optimised solution TC: O(n) SC: O(1)
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;

       ListNode prev=result;
       prev.next=head;
       while(prev.next!=null && prev.next.next!=null){
        ListNode node1=prev.next;
        ListNode node2=node1.next;
        ListNode after=node2.next;

        prev.next=node2;
        node2.next=node1;
        node1.next=after;

        prev=node1;
       }
       return dummy.next;


    }
}
