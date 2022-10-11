public class implement_stack_using_queues {
    class MyStack {
        Queue<Integer> q1=new ArrayDeque<Integer>();
        Queue<Integer> q2=new ArrayDeque<Integer>();
        // public MyStack() {
        //     q1=new ArrayDeque<Integer>();
        //     q2=new ArrayDeque<Integer>();
        // }
        
        public void push(int x) {
            q2.add(x);
            // while(!q1.isEmpty()){
            //     q2.add(q1.remove());
            // }
            for(int i=1;i<q1.size();i++){
                q2.add(q1.remove());
            }
            q1=q2;
        }
        
        public int pop() {
            return q1.poll();
        }
        
        public int top() {
            return q1.peek();
        }
        
        public boolean empty() {
            return q1.isEmpty();
        }
    }
    
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
