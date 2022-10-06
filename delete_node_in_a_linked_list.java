public class delete_node_in_a_linked_list {
    public void deleteNode(ListNode node) {
        //  ListNode prev=node;
        // while(node.next!=null){
        //     node.val=node.next.val;
        //     prev=node;
        //     node=node.next;
        // } 
        //  prev.next=null;
        if(node.next!=null){
            node.val=node.next.val;
            node.next=node.next.next;
            node=node.next;
        } 
     }
}
