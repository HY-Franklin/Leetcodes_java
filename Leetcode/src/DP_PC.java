
//121. Best Time to Buy and Sell Stock
class Solution121 {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE; int profit=0;
        for(int price:prices){
            buy=Math.min(buy,price);
            profit=Math.max(profit,price-buy);
        }
        return profit;
    }
}

public class DP_PC {
    public static void main(String[] args) {
        Solution121 s=new Solution121();
        s.maxProfit(new int[]{ 1,2,3,4,5,6,7,8,9,10 });
    }
}