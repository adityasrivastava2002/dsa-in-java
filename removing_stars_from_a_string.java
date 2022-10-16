public class removing_stars_from_a_string {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        Stack<Character> copy=new Stack<>();
        while(!st.isEmpty()){
            copy.push(st.pop());
        }
        String str="";
        while(!copy.isEmpty()){
            str=str+copy.pop();
        }
        return str;
    }
}
