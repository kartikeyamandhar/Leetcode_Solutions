class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res=0
        min1=1000000
        for i in range(0,len(prices)):
            min1=min(prices[i],min1)
            res=max(prices[i]-min1,res)
            
        return res
