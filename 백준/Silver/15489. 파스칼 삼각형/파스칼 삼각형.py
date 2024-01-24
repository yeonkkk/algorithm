import sys

input = sys.stdin.readline

r, c, w = map(int, input().split())

dp = [[0] * i for i in range(1, max(r, c) + w + 1)]

for i in range(r + w):
    length = len(dp[i])

    for j in range(length):
        if j == 0 or j == (length - 1):
            dp[i][j] = 1
            continue
        
        dp[i][j] = sum(dp[i-1][j - 1 : j + 1])

count = 1
result = 0

while count <= w:
    nums = dp[r-1][c-1 : c + count - 1]
    result += sum(nums)
    count += 1
    r += 1
    
print(result)