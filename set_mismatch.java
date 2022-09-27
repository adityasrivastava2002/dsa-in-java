import java.util.Arrays;

public class set_mismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4};
            int[] ans=new int[2];
            int i=0;
            while(i<arr.length){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp=arr[correct];
                    arr[correct]=arr[i];
                    arr[i]=temp;
                }
                else{
                    i++;
                }
            }
            i=0;
            while(i<arr.length){
                if(arr[i]-1!=i){
                    ans[0]=arr[i];
                    ans[1]=i+1;
                }
                i++;
            }
            System.out.println(Arrays.toString(ans));
        }
}
