// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip middle for odd length
        if (fast != null) {
            slow = slow.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow);

        // Compare halves
        ListNode first = head;

        while (secondHalf != null) {
            if (first.val != secondHalf.val) {
                return false;
            }
            first = first.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
// Optimised approach TC: O(n) SC: O(n) Stack Trace
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode rev=reverse(slow,null);
        ListNode curr=head;

        while(rev!=null){
            if(curr.val != rev.val){
                return false;
            }

            curr=curr.next;
            rev=rev.next;
        }

        return true; 
    }
    private ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null)
        return prev;

        ListNode after=curr.next;
        curr.next=prev;
        return reverse(after,curr);
    }
}
