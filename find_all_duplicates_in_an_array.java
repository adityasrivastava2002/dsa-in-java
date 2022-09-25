import java.util.*;
public class find_all_duplicates_in_an_array {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        int i=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        i=0;
        while(i<nums.length){
            if(nums[i]-1!=i){
                list.add(nums[i]);
            }
            i++;
        }
        System.out.println(list);
    }
}
