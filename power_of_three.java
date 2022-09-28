public class power_of_three {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n==2){
            return false;
        }
        if(n%3==0){
            return isPowerOfThree(n/3);
        }
        else{
            return false;
        }
    }
}
