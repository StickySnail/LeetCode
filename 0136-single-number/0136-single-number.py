class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        store = list()

        for num in nums:
            if num not in store:
                store.append(num)
            else:
                store.remove(num)

        return store[0]
