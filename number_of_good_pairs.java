import java.util.*;
public class number_of_good_pairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> set=new HashMap<>();
        int c=0;
        for(int i:nums){
            if(set.containsKey(1)){
                set.put(nums[i],c+1);
            }
            else{
                set.put(nums[i],1);
            }
        }
        c=0;
        for(Map.Entry<Integer,Integer> e:set.entrySet()){
            if(e.getValue()>1)
                c++;
        }
        return c;
    }
}
