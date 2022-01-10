class Solution:
    def firstUniqChar(self, s: str) -> int:
        dict={}
        for i in s:
            if i in dict:
                dict[i]+=1
            else:
                dict[i]=1
        for i in range(0,len(s)):
            if dict[s[i]]==1:
                return i
      
        return -1
