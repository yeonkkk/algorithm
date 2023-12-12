import sys
input = sys.stdin.readline

def perm(arr, r):
    arr = sorted(arr)
    used = [0 for _ in range(len(arr))]

    def dfs(nums, used):
        global result

        if len(nums) == r:
            result.append(nums.copy())
            return
	
        for i in range(len(arr)):
            if not used[i]:
                nums.append(str(arr[i]))
                used[i] = 1
                dfs(nums, used)
                used[i] = 0
                nums.pop()
    dfs([], used)

n, m = map(int, input().split())

nums = [i + 1 for i in range(n)]
nums.sort()
result = []

perm(nums, m)

for val in result:
    print(' '.join(val))