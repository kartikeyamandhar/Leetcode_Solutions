import math
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = len(nums)

        output = [0]*l
        prev = 1
        for i in range(0, l):
            output[i], prev = prev, prev*nums[i]

        prev = 1
        for i in range(l-1, -1, -1):
            output[i], prev = output[i]*prev, prev*nums[i]

        return output
