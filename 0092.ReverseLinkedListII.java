class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;
        for(int i=1; i<m;i++){
             prev = curr;
             curr = curr.next;
        }

        ListNode prev2 = prev;
        ListNode curr2 = curr;

        for(int i=m;i<=n;i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (prev2 != null) {
            prev2.next = prev;
        } else {
            head = prev;
        }
            curr2.next = curr;
        return head;
    }
}