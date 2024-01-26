import sys

input = sys.stdin.readline

n = int(input())
nums = [1, 1, 2, 5]

if 3 < n:
    for i in range(4, n + 1):
        num = 0
        for j in range(i):
            num += nums[j] * nums[i-j-1]
        nums.append(num)

print(nums[n])