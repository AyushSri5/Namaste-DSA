// Optimised approach TC: O(n) SC: O(n)
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;

        int sum=0;
        int carry=0;

        ListNode curr=l1;
        ListNode curr2=l2;

        while(curr!=null || curr2!=null){
            if(curr!=null){
                sum+=curr.val;
                curr=curr.next;
            }

            if(curr2!=null){
                sum+=curr2.val;
                curr2=curr2.next;
            }

            result.next=new ListNode((sum+carry)%10);
             carry=(sum+carry)/10;
            result=result.next;
            sum=0;
           
        }
        if(carry>0){
            result.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
