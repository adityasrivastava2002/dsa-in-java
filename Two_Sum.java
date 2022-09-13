public class Two_Sum {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] b=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int sum=nums[i]+nums[j];
                if(sum==target)
                {
                    
                        
                        b[0]=i;
                        b[1]=j;
                        return b;
                    
                }
            }
        }
        return b;
    }
}
