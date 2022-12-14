public class merge_two_sorted_lists {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head=new ListNode(0);
        ListNode list=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                list.next=list1;
                list1=list1.next;
            }
            else{
                list.next=list2;
                list2=list2.next;
            }
            list=list.next;
        }
        if(list1!=null){
            list.next=list1;
        }
        if(list2!=null){
            list.next=list2;
        }
        return head.next;
    }
}
