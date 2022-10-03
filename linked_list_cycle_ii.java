public class linked_list_cycle_ii {
    public ListNode detectCycle(ListNode head) {
        // HashSet<ListNode> set=new HashSet<>();
        // while(head!=null){
        //     if(set.contains(head)){
        //         return head;
        //     }
        //     set.add(head);
        //     head=head.next;
        // }
        // return head;
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                break;
            }
        }
        if(f==null || f.next==null){
            return null;
        }
        while(head!=f){
            head=head.next;
            f=f.next;
        }
        return head;
    }
}
