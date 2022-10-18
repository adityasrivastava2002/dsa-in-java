public class make_the_string_great {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && (Math.abs(st.peek()-s.charAt(i)) == 32)){
                  st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        while(!st.isEmpty()){
            str=st.pop()+str;
        }
        return str;
    }
}
