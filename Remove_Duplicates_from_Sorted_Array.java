public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int nums[]={0,0,1,2,2,2,3};
        int i,j=0;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        System.out.println(j+1);
    }
}
