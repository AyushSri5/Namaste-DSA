// Brute Force TC: O(n) SC: O(n)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;

        ListNode dummy=new ListNode(0);
        ListNode result=dummy;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                result.next=new ListNode(l1.val);
                result=result.next;
                l1=l1.next;
            }
            else{
                result.next=new ListNode(l2.val);
                result=result.next;
                l2=l2.next;
            }
        }
        while(l1!=null){
            result.next=new ListNode(l1.val);
            result=result.next;
            l1=l1.next;
        }
        while(l2!=null){
            result.next=new ListNode(l2.val);
            result=result.next;
            l2=l2.next;
        }
        return dummy.next;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode result=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                result.next=list1;
                list1=list1.next;
                result=result.next;
            }
            else{
                result.next=list2;
                list2=list2.next;
                result=result.next;
            }
        }

        result.next = list1 == null ? list2:list1;

        return dummy.next;
    }
}
