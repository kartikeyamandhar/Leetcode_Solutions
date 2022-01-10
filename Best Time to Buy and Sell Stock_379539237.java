class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int j=0;
        for(int i=1;i<n;i++){
            int comp=prices[i]-prices[j];
            if(comp>max){
                max=comp;
            }
            if(prices[i]<prices[j]){
                j=i;
            }
        }
        return max;
        
    }
}
