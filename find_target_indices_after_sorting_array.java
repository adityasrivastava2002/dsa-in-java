import java.util.*;
public class find_target_indices_after_sorting_array {
    
        public static void main(String[] args) {
                int[] nums={1,2,5,2,3};
                int target=2;
                Arrays.sort(nums);
                List<Integer> l=new ArrayList<>();
                find_target_indices_after_sorting_array aa=new find_target_indices_after_sorting_array();
                int fi=aa.bs(nums,target,true);
                int li=aa.bs(nums,target,false);
                for(int i=fi;i<=li;i++){
                    if(i>=0)
                    l.add(i);
                }
                System.out.println(l);
            }
            public int bs(int[] arr, int target, boolean firstIndex){
                int start=0;
                int ans=-1;
                int end=arr.length-1;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(arr[mid]>target){
                        end=mid-1;
                    }
                    else if(arr[mid]<target){
                        start=mid+1;
                    }
                    else{
                        ans=mid;
                        if(firstIndex){
                            end=mid-1;
                        }
                        else{
                            start=mid+1;
                        }
                    }
                }
                return ans;
            }
        }
    

