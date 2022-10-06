public class odd_even_linked_list {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode s=head,f=head.next,point=head.next,orig=head;
        while(f!=null && f.next!=null){
            s.next=s.next.next;
            s=s.next;
            f.next=f.next.next;
            f=f.next;
        }
        s.next=point;
        return orig;
    }
}
