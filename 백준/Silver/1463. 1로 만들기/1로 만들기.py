import sys

input = sys.stdin.readline

n = int(input())
dp = [0] * (n + 1)

for i in range(2, n + 1):
    if i in (2, 3):
        dp[i] = 1
        continue

    dp[i] = dp[i-1] + 1

    if i % 3 == 0: dp[i] = min(dp[i], dp[i//3] + 1)
    if i % 2 == 0: dp[i] = min(dp[i], dp[i//2] + 1)

print(dp[n])
