import sys

input = sys.stdin.readline

n = int(input())

nums = []
for _ in range(n):
    nums.append(int(input()))

nums.sort(reverse=True)

sum = 0
for i, num in enumerate(nums):
    if (i + 1) % 3 == 0:
        continue
    sum += num

print(sum)