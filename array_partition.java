import java.util.*;
public class array_partition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i=i+2){
            ans+=nums[i];
        }
        return ans;
    }
}
