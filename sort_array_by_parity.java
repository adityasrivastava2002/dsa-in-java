public class sort_array_by_parity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0,j=nums.length-1,k=0;
        for(int m=0;m<nums.length;m++){
            if(nums[m]%2==0){
                ans[i]=nums[m];
                i++;
            }
            else{
                ans[j]=nums[m];
                j--;
            }
        }
        return ans;
    }
}
