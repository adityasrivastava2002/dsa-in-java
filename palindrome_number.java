public class palindrome_number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        // int num=x;
        if(palin(x,0)==x)
            return true;
        else{
            return false;
        }
    }
    private static int palin(int x,int c){
        if(x==0){
            return c;
        }
        int n=(x%10)+(10*c);
        return palin(x/10,n);
    }
}
