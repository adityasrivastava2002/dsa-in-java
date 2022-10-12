public class add_two_numbers_ii {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        // Stack<Integer> ans=new Stack<>();
        ListNode head = new ListNode();
        // ListNode head = dummyNode;
        int sum=0,carry=0;
        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
        while(!st1.isEmpty() || !st2.isEmpty()){
            sum=carry;
            if(!st1.isEmpty()){
                sum+=st1.pop();
            }
            if(!st2.isEmpty())
            sum+=st2.pop();
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = head.next;
            head.next = newNode;
            
            carry = sum / 10;
        }
        
        if(carry == 1){
            ListNode newNode = new ListNode(1);
            newNode.next = head.next;
            head.next = newNode;
        }
        
        return head.next;
    }
}
