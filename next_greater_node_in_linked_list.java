public class next_greater_node_in_linked_list {
    public int[] nextLargerNodes(ListNode head) {
        int l=size(head);
        int[] ans=new int[l];
        int i=0;
        while(head!=null){
            ans[i]=search(head);
            head=head.next;
            i++;
        }
        return ans;
    }
    public static int search(ListNode node){
        int val=node.val;
        while(node.next!=null){
            if(node.next.val>val){
                return node.next.val;
            }
            else{
                node=node.next;
            }
        }
        return 0;
    }
    public static int size(ListNode node){
        int s=0;
        while(node!=null){
            s++;
            node=node.next;
        }
        return s;
    }
}
