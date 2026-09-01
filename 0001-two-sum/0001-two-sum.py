class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        coll = {}
        for i in range(len(nums)):
            compl = target - nums[i]
            if compl in coll:
                return [i,coll[compl]]
            else:
                coll[nums[i]] = i
        
        return -1