import sys

input = sys.stdin.readline

n = int(input().strip())
dp = [0] * (n + 1)

for i in range(1, n + 1):
    dp[i] = dp[i-1] + 1

    for num in [2, 5, 7]:
        if i >= num:
            dp[i] = min(dp[i-num] + 1, dp[i])
    
print(dp[n])