class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int il=prices[0];
        for(int i=1;i<prices.length;i++){
            il=Math.min(il,prices[i]);
            if(il<prices[i]){
                max=Math.max(prices[i]-il,max);
            }
        }
        return max;
    }
}
