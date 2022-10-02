public class convert_binary_number_in_a_linked_list_to_integer {
    int i=0;
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        return getDecimalValue(head.next)+head.val*(int)Math.pow(2,i++);

    }
}
