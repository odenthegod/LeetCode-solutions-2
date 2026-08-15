class Solution(object):
    def smallestEqual(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        for i in range(0,n):
            if (i%10==nums[i]):
                return i
        return -1
        