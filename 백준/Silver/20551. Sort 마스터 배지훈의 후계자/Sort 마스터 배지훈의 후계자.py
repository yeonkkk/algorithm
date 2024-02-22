import sys

def binary_search(target):
    start, end = 0, len(nums) - 1

    while start < end:
        mid = (start + end) // 2

        if target <= nums[mid]:
            end = mid
        else:
            start = mid + 1
    
    if nums[start] == target:
        return start
    else:
        return -1

n, m = map(int, sys.stdin.readline().split())
nums = [int(sys.stdin.readline().strip()) for _ in range(n)]
nums.sort()

for _ in range(m):
    question = int(sys.stdin.readline().strip())
    print(binary_search(question))