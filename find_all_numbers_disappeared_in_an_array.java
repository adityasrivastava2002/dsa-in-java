import java.util.*;
public class find_all_numbers_disappeared_in_an_array {
        public static void main(String[] args) {
            ArrayList<Integer> nlist=new ArrayList<>();
        int i=0;
        int[] nums={4,3,2,7,8,2,3,1};
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                // swap(nums,i,correct);
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                nlist.add(nums[i]);
            }
            i++;
        }
        // nlist.add(9);
        System.out.println(nlist);
        }
}
    
    

