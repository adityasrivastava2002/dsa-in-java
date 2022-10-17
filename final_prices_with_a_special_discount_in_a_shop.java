public class final_prices_with_a_special_discount_in_a_shop {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()>prices[i]){
                while(!st.isEmpty() && st.peek()>prices[i]){
                    st.pop();
                }
            }
            if(!st.isEmpty()){
                ans[i]=prices[i]-st.peek();
            }
            else{
                ans[i]=prices[i];
            }
            st.push(prices[i]);
        }
        return ans;
    }
}
