public class reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode Next=head.next;
            head.next=prev;
            prev=head;
            head=Next;
        }
        return prev;
    }
}
