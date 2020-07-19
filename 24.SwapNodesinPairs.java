class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode n1 = current.next;
            ListNode n2 = current.next.next;
            current.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            current = n1;
        }
        return dummy.next;
    }
}