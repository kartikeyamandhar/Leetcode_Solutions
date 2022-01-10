class Solution:
    def climbStairs(self, n: int) -> int:
        ls=[1,1]
        for i in range(2,n+1):
            ls.append(ls[i-1]+ls[i-2])
        return ls[n]
