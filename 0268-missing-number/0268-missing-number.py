import numpy as np
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        listSum = sum(nums)
        actualSum = (n +1)*n // 2
        return  actualSum- listSum 

    