class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        if(m==n==1):
            return 1
        else:
            matrix=[[0 for i in range(n)]  for j in range(m)]
            
            for i in range(1,n):
                matrix[0][i]=1
                
            for j in range(1,m):
                matrix[j][0]=1
                
            for i in range(1,m):
                for j in range(1,n):
                    matrix[i][j]=matrix[i-1][j]+matrix[i][j-1]
                    
        return matrix[m-1][n-1]
