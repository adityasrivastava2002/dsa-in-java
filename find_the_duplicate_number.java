public class find_the_duplicate_number {
    public static void main(String[] args) {
        int i=0;
        int[] nums={1,3,4,2,2};
        while(i<nums.length){
            int correct=nums[i];
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
        while(i<=nums.length){
            if(nums[i]!=i){
                System.out.println(nums[i]);
            }
        }
        // return -1;
    }
}
