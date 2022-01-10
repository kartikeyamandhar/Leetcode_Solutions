# -*- coding: utf-8 -*-
"""
Created on Mon Jun 14 02:24:15 2021

@author: Kartikeya Mandhar
"""

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        else:
            return sorted(s)==sorted(t)
           