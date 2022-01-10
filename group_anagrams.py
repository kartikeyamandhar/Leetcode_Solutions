# -*- coding: utf-8 -*-
"""
Created on Mon Jun 14 02:25:17 2021

@author: Kartikeya Mandhar
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        for i in strs:
            s="".join(sorted(i))
            if s not in map:
                map[s]=[i]
            else:
                map[s].append(i)
        return [i for i in map.values()]