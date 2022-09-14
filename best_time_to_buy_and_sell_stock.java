public class best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices.length>0?prices[0]:0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>profit){
                profit=prices[i]-min;
            }
        }
        return profit;
    }
}
