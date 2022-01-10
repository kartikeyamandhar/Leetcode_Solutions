# -*- coding: utf-8 -*-
"""
Created on Sun Jun 13 03:47:03 2021

@author: Kartikeya Mandhar
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxs=nums[0]
        csum=0
        for i in nums:
            if csum<0:
                csum=0
            csum+=i
            maxs=max(maxs,csum)
        return maxs