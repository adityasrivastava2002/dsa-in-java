public class remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode prev=null;
        while(head.val==val){
            head=head.next;
            if(head==null){
                return prev;
            }
        }
        ListNode temp=head;
        while(head.next!=null){
            prev=head;
            head=head.next;
            while(head.val==val && head!=null){
                prev.next=head.next;
                head=head.next;
                if(head==null){
                return temp;
            }
            }
        }
        return temp;
    }
}
