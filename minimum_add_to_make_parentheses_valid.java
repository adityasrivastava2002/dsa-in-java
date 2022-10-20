public class minimum_add_to_make_parentheses_valid {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int counter=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            // else if(!st.isEmpty() && c==')'){
            //     st.pop();
            // }
            // else{
            //     counter++;
            // }
            else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        // if(counter>0){
        //     return counter;
        // }
        return st.size();
    }
}
