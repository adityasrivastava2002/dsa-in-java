public class binay_search {
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1;
        return sort(nums,target,s,e);
    }
    static int sort(int[] nums, int t, int s, int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==t){
            return mid;
        }
        else if(nums[mid]<t){
            return sort(nums,t,mid+1,e);
        }
        else{
            return sort(nums,t,s,mid-1);
        }
    }
}
