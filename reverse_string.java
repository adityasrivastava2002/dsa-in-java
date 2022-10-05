public class reverse_string {
    public void reverseString(char[] s) {
        int j=s.length-1;
        char[] arr=new char[j];
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }
}
