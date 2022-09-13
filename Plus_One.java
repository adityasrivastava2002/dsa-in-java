import java.util.*;
public class Plus_One {
    public static void main(String[] args) {
        int digits[]={9,8,9};
        int i=0;
        for(i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                digits[i]+=1;
                break;
            }
        }
            if(digits[0]==0){
                int res[]=new int[digits.length+1];
            res[0]=1;
            System.out.println(Arrays.toString(res));
            }
        System.out.println(Arrays.toString(digits));    }
}
