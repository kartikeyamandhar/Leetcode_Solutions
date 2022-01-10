
import math

nums=[1,2,3,4]
res=[]
pre=1
post=1
for i in range(len(nums)):
    pre=math.prod(nums[0:i])
    post=math.prod(nums[i+1:len(nums)])
    res.append(pre*post)
print(res)