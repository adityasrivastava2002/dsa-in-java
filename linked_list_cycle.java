public class linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        // HashSet<ListNode> set=new HashSet<>();
        // while(head!=null){
        //     if(set.contains(head)){
        //         return true;
        //     }
        //     set.add(head);
        //     head=head.next;
        // }
        // return false;
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;
            }
        }
        return false;
    }
}
