import java.util.*;
public class intersection_of_two_arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]&&search(arr,nums1[i])){
                    arr.add(nums1[i]);
                    // k++;
                }
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    public static boolean search(ArrayList<Integer> arr, int t){
        for(int m=0;m<arr.size();m++){
            if(arr.get(m)==t){
                return false;
            }
        }
        return true;
    }
}
