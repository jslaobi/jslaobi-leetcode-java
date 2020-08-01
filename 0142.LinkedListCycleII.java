public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
    
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(!isCycle){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}