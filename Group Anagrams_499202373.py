class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashed_strs = {}
        for v in strs:
            s = "".join(sorted(v))
            if s in hashed_strs:
                hashed_strs[s].append(v)
            else:
                hashed_strs[s] = [v]
        
        return [x for x in hashed_strs.values()]
