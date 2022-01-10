# -*- coding: utf-8 -*-
"""
Created on Sun Jun 13 03:47:31 2021

@author: Kartikeya Mandhar
"""

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res=max(nums)
        curmin,curmax=1,1
        for i in nums:
            if i==0:
                curmin,curmax=1,1
                continue
            tmp=curmax*i
            curmax=max(i*curmax,i*curmin,i)
            curmin=min(tmp,i*curmin,i)
            res=max(res,curmax,curmin)
        return res
            