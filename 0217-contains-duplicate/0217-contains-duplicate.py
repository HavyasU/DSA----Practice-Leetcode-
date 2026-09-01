class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hs = set()
        for ele in nums:
            if ele in hs:
                return True
            else:
                hs.add(ele)
        
        return False