// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode after = curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
}
// Optimised approach TC: O(n) SC: O(n) (Stack memory)
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }
    private ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null)
        return prev;

        ListNode after=curr.next;
        curr.next=prev;
        return reverse(after,curr);
    }
}
