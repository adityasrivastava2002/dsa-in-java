import java.util.*;
public class longest_subsequence_with_limited_sum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int answers[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int s=0,c=0;
            for(int j=0;j<nums.length;j++){
            if((s+nums[j])<=queries[i]){
                s=s+nums[j];
                c++;
            }
            
            }
            answers[i]=c;
        }
        return answers;
    }
}
