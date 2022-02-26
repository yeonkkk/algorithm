def solution(nums):
    nums = list(map(str, nums))
    nums.sort(key = lambda x: x * 3, reverse = True)
    return ''.join(nums)
