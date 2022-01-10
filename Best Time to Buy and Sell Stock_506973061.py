class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res=0
        mi=math.inf
        for price in prices:
            mi=min(mi,price)
            profit=price-mi
            res=max(res,profit)
        return res
