class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        first = 0
        last = len(nums) - 1
        mid = mid = (first + last)//2

        while (first<= last):

            if nums[mid] == target:
                return mid
            
            if nums[mid]>target:
                last = mid -1
                mid = (first + last)//2

            else:
                first = mid + 1
                mid = (first + last)//2
        return -1