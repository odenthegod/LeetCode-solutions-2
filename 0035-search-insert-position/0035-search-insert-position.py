class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        start = 0
        end = len(nums) - 1
        
        while start <= end:
            # Use integer division (//) to avoid float issues in Python
            mid = start + (end - start) // 2
            
            # The conditional checks must be INSIDE the while loop
            if target == nums[mid]:
                return mid
            elif target < nums[mid]:
                end = mid - 1
            else:
                start = mid + 1
        
        # If the target is not found, start will be the correct insertion index
        return start

        