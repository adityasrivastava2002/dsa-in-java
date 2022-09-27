public class first_missing_positive {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]){
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
                return i+1;
            }
            i++;
        }
        return i+1;
    }
}
