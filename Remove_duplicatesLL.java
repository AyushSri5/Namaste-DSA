// Brute Force TC: O(n) SC: O(n)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> hs=new TreeSet<>();
        ListNode curr=head;
        while(curr!=null){
            hs.add(curr.val);
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        for(int i:hs){
            result.next=new ListNode(i);
            result=result.next;
        }
        return dummy.next;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode curr=head;
        while(curr.next!=null){
            if(curr.val==curr.next.val){
                ListNode prev=curr;
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                prev.next=curr.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
