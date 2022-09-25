import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class third_maximum_number {
    public static void main(String[] args) {
        int[] nums={-3,-2,-1,0};
        thirdMax(nums);
    }
    public static void thirdMax(int[] nums) {
        Arrays.sort(nums);
        // int[] k=new int[3];
        int previous=ThreadLocalRandom.current().nextInt(),c=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=previous){
                previous=nums[i];
                c++;
                if(c==3){
                    System.out.println(previous);
                    break;
                }
            }
        }
        if(c!=3)
        System.out.println(nums[nums.length-1]);
    }
}
