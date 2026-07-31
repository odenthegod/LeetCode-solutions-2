class Solution(object):
    def missingNumber(self, nums):
        n=len(nums)
        sum=(n*(n+1))/2
        for i in range(0,n):
            sum=sum-nums[i]
        return sum
        