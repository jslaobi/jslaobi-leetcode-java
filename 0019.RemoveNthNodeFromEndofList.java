class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode n1 = dummy;
        ListNode n2 = dummy;
        for (int i = 0; i <= n; i++) {
            n2 = n2.next;
        }
        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        n1.next = n1.next.next;
        return dummy.next;
    }
}