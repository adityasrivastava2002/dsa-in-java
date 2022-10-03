public class remove_duplicates_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=head;
        ListNode newhead=head;
        head=head.next;
        while(head!=null){
            if(prev.val==head.val){
                prev.next=head.next;
            }
            else{
                prev=prev.next;
            }
            head=head.next;
        }
        return newhead;
    }
}
