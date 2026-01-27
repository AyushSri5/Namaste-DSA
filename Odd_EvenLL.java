// Brute Force TC: O(n) SC: O(n)
class Solution {
    public ListNode oddEvenList(ListNode head) {
         List<Integer> odd=new ArrayList<>();
         List<Integer> even=new ArrayList<>();
         ListNode curr=head;
         int index=0;

         while(curr!=null){
            if(index%2!=0){
                even.add(curr.val);
            }
            else{
                odd.add(curr.val);
            }
            curr=curr.next;
            index++;
         }
         ListNode dummy=new ListNode(0);
         ListNode result=dummy;

         for(int i:odd){
            result.next=new ListNode(i);
            result=result.next;
         }
         for(int i:even){
            result.next=new ListNode(i);
            result=result.next;
         }
         return dummy.next;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode fhead=head;
        ListNode shead=head.next;

        ListNode c1=fhead;
        ListNode c2=shead;

        while(c2!=null && c2.next!=null){
            ListNode after=c2.next;
            c1.next=after;
            c2.next=after.next;
            c1=after;
            c2=after.next;
        }
        c1.next=shead;
        return fhead;
    }
}
