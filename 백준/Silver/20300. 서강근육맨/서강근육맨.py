import sys

input = sys.stdin.readline

def calculate_max_m(n, nums):
    max_sum = 0

    for i in range(0, n//2):
        current_sum = nums[i] + nums[n - (i + 1)]
        max_sum = max(max_sum, current_sum)
    
    return max_sum

def solution(n, nums):
    nums.sort()

    if n % 2 == 0:
        return calculate_max_m(n, nums)
    else:
        return max(nums[-1], calculate_max_m(n - 1, nums[:-1]))

n = int(input())
nums = list(map(int, input().split()))

print(solution(n, nums))