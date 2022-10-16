public class backspace_string_compare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        int i=0;
        while(i<str1.length || i< str2.length){
            if(i<str1.length){
                if('#'==str1[i]){
                if(!st1.isEmpty())
                st1.pop();
                }
                else{
                    st1.push(str1[i]);
                }
            }
            if(i<str2.length){
                if('#'==str2[i]){
                if(!st2.isEmpty())
                st2.pop();
                }
                else{
                    st2.push(str2[i]);
                }
            }
            i++;
    
        }
        String str3="";
        String str4="";
        while(!st1.isEmpty() || !st2.isEmpty()){
            if(!st1.isEmpty()){
                str3=str3+st1.pop();
            }
            if(!st2.isEmpty()){
                str4=str4+st2.pop();
            }
        }
        return(str3.equals(str4));
    }
}
