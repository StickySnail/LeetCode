# class Solution:
#     def singleNumber(self, nums: List[int]) -> int:
#         store = list()

#         for num in nums:
#             if num not in store:
#                 store.append(num)
#             else:
#                 store.remove(num)

#         return store[0]

    
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 0
        for num in nums:
            xor ^= num
        
        return xor