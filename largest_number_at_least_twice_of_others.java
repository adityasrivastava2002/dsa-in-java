public class largest_number_at_least_twice_of_others {
    public static void main(String[] args) {
        int[] nums={3,6,1,0};
        System.out.println(number(nums));
    }
    public static int number(int[] nums){
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]*2>max && i!=index){
                return -1;
            }
            // else{
            //     return -1;
            // }
        }
        return index;
    }
}
