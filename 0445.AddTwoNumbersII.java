class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0; 
        ListNode curr = null;
        
        while(!stack1.empty() || !stack2.empty()){
            int sum = 0;
            if(!stack1.empty()){
                sum += stack1.pop();
            }
            if(!stack2.empty()){
                sum += stack2.pop();
            }

            sum += carry;

            ListNode node = new ListNode(sum % 10);
            carry = sum / 10;

            node.next = curr;
            curr = node;
        }
        
        if(carry != 0){
            ListNode node = new ListNode(carry);
            node.next = curr;
            curr = node;
        }

        return curr;
    }
}