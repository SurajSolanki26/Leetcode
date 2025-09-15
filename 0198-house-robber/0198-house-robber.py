class Solution:
    def rob(self, nums):
        from functools import lru_cache

        @lru_cache(None)  # memoization
        def dp(i):
            if i < 0:
                return 0
            if i == 0:
                return nums[0]
            
            # either rob current house i or skip it
            return max(dp(i-1), nums[i] + dp(i-2))
        
        return dp(len(nums)-1)
