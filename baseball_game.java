public class baseball_game {
    public int calPoints(String[] str) {
        Stack<Integer> st=new Stack<>();
        for(String c : str){
            if("C".equals(c)){
                st.pop();
            }
            else if("D".equals(c)){
                st.push(st.peek()*2);
            }
            else if("+".equals(c)){
                int temp1=st.pop();
                int sum=st.peek()+temp1;
                st.push(temp1);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
        int s=0;
        while(!st.isEmpty()){
            s=s+st.pop();
        }
        return s;
    }
}
