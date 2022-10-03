public class remove_duplicates_from_sorted_list_ii {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        // ListNode dummy= new ListNode(10);
        // dummy.next=head;
        // ListNode prev=dummy;
        // while(head!=null){
        //     if(head.next!=null && head.val==head.next.val){
        //         while(head.next!=null && head.val==head.next.val){
        //             head=head.next;
        //         }
        //         prev.next=head.next;
        //     }
        //     else{
        //         prev=prev.next;
        //     }
        //     head=head.next;
        // }
        // return dummy.next;
        ListNode dummy=new ListNode(0);
        ListNode s=dummy,f=head;
        s.next=f;
        while(f!=null){
            while(f.next!=null && f.val==f.next.val){
                f=f.next;
            }
            if(s.next==f){
                s=s.next;
                f=f.next;
            }
            else{
                s.next=f.next;
                f=s.next;
            }
        }
        return dummy.next;
    }
}
