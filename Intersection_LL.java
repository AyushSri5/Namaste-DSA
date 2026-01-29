// Brute Force TC: O(n) SC: O(n)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1=headA;
        HashSet<ListNode> hs=new HashSet<>();
        while(curr1!=null){
            hs.add(curr1);
            curr1=curr1.next;
        }
        ListNode curr2=headB;
        while(curr2!=null){
            if(hs.contains(curr2)){
                return curr2;
            }
            curr2=curr2.next;
        }
        return null;
    }
}
// Optimised approach TC: O(n) SC: O(1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        boolean flag1=false;
        ListNode temp2=headB;
        boolean flag2=false;

        while(temp1!=null || temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1==null && !flag1){
                temp1=headB;
                flag1=true;
            }
            if(temp2==null && !flag2){
                temp2=headA;
                flag2=true;
            }
        }
        return null;
    }
}
