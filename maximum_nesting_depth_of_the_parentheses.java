public class maximum_nesting_depth_of_the_parentheses {
    public int maxDepth(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                st.pop();
            }
            if(st.size()>count){
                count=st.size();
            }
        }
        return count;
    }
}
