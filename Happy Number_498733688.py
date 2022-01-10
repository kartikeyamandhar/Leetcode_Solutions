class Solution:
    def isHappy(self, n: int) -> bool:
        if n==1:
            return True
        ls=[]
        while(n!=1):
            sum1=sum((int(i)**2) for i in str(n))
            if sum1 not in ls:
                ls.append(sum1)
                n=sum1
            else:
                return False
            
             
                
        return True
