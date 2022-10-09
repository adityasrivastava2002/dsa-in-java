public class remove_outermost_parentheses {
    public String removeOuterParentheses(String str) {
        char[] s=str.toCharArray();
        // int c=0,c2=0;
        String st="";
        Stack<String> stack=new Stack<>();
        for(char ch : s){
            if(ch=='('){
                if(stack.size()>=1){
                    st=st+"(";
                }
                stack.push("(");
            }
            else if(ch==')'){
                stack.pop();
                if(stack.size()>=1){
                    st=st+")";
                }
            }
        }
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==){
        //         stack.push("(");
        //         c++;
        //         if(c>=0){
        //             st=st+"(";
        //         }
        //     }
        //     else if(str.charAt(i)==')');{
        //         if(!stack.empty())
        //         stack.pop();
        //         c--;
        //         if(c>=0){
        //             st=st+")";
        //         }
        //     }
        // }
        return st;
    }
}
