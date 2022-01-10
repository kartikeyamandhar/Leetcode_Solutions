# -*- coding: utf-8 -*-
"""
Created on Sun Jun 13 04:18:13 2021

@author: Kartikeya Mandhar
"""

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charset=set()
        l=0
        res=0
        for r in range(len(s)):
            while s[r] in charset:
                charset.remove(s[l])
                l+=1
            charset.add(s[r])
            res=max(res,r-l+1)
        return res