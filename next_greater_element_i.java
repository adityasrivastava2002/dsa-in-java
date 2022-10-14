import java.util.*;
public class next_greater_element_i {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums2.length];
        int[] ansf=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(nums2[i]);
            }
            else{
                if(nums2[i]<st.peek()){
                    ans[i]=st.peek();
                    st.push(nums2[i]);
                }
                else{
                    while(st.size()>0 && nums2[i]>st.peek()){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        ans[i]=-1;
                    }
                    else
                    ans[i]=st.peek();
                    st.push(nums2[i]);
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j] && j<nums2.length){
                j++;
            }
            ansf[i]=ans[j];
        }
        return ansf;
    }
}
