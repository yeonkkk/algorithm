def solution(nums):
    max = len(nums)//2
    nums2 = set(nums)
    return max if len(nums2) >= max else len(nums2)
