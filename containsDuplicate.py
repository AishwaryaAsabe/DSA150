from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        
        for n in nums:
            if n in hashset:
                return True 
            hashset.add(n)  
        
        return False  


nums = [1, 2, 3, 4, 1]  
sol = Solution()
print(sol.containsDuplicate(nums))  

