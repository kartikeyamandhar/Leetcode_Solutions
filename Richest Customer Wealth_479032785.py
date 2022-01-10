class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ls=[]
        sum1=0
        for i in accounts:
            for j in i:
                sum1+=j
                ls.append(sum1)
            sum1=0
        return max(ls)
        
