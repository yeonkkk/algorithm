import sys
input = sys.stdin.readline

n = int(input())
k = int(input())

numbers = [int(input()) for _ in range(n)]
used = [0 for _ in range(len(numbers))]
results = set()

def dfs(nums, k):
    global results

    if len(nums) == k:
        result_num = ''.join(nums)
        results.add(result_num)
        return
    
    for i in range(len(numbers)):
        if not used[i]:
            nums.append(str(numbers[i]))
            used[i] = 1
            dfs(nums, k)
            used[i] = 0
            nums.pop()

dfs([], k)
print(len(results))
