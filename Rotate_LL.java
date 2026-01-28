// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head;
        int len=0;
        while(slow!=null){
            len++;
            slow=slow.next;
        }
        if(len==0)
        return head;
        k=k%len;
        if(k==0)
        return head;
        
        
        ListNode fast=head;
        slow=head;
        while(k-->0){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode nhead=slow.next;
        slow.next=null;
        fast.next=head;
        return nhead;

    }
    private ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null)
        return prev;

        ListNode after=curr.next;
        curr.next=prev;
        return reverse(after,curr);
    }
}
