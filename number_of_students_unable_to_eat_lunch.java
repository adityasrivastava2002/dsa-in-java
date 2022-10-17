public class number_of_students_unable_to_eat_lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i : students){
            q.add(i);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int c=q.size()*st.size();
        while(c-->0){
            if(!st.isEmpty() && q.element()==st.peek()){
                q.remove();
                st.pop();
            }
            else{
                if(!q.isEmpty()){
                    q.offer(q.poll());
                }
                else{
                    return 0;
                }
            }
        }
        return st.size();
    }
}
