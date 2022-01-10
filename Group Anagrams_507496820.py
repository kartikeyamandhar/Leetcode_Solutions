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
