public class sort_array_by_parity_ii {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0,j=1,m=0;
        for(m=0;m<nums.length;m++){
            if(nums[m]%2==0){
                ans[i]=nums[m];
                i+=2;
            }
            else{
                ans[j]=nums[m];
                j+=2;
            }
        }
        return ans;
    }
}
