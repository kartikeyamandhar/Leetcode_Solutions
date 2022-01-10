# -*- coding: utf-8 -*-
"""
Created on Sat Jun 12 23:58:31 2021

@author: Kartikeya Mandhar
"""

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0,len(nums)):
            diff=target-nums[i]
            if diff in nums[i+1:]:
                return [i,nums.index(diff,i+1)]
            
                