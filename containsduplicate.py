# -*- coding: utf-8 -*-
"""
Created on Sun Jun 13 01:21:58 2021

@author: Kartikeya Mandhar
"""

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(set(nums)) < len(nums)