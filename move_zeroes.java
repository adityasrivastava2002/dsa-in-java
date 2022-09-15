public class move_zeroes {
    public void moveZeroes(int[] nums) {
        int i,j=0,c=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                continue;
            }
            nums[j]=nums[i];
            j++;
        }
        for(i=0;i<c;i++){
            nums[nums.length-1-i]=0;
        }
    }
}
