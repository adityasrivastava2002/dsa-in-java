public class guess_number_higher_or_lower {
    public int guessNumber(int n) {
        int s=1,e=n,mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==1){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return mid;
    }
}
