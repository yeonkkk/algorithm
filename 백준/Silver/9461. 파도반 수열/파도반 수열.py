import sys

input = sys.stdin.readline

t = int(input().strip())

dp = [0] * 101
dp[1] = 1
dp[2] = 1
dp[3] = 1
dp[4] = 2

for _ in range(t):
    n = int(input().strip())

    for i in range(5, n + 1):
        dp[i] = dp[i-1] + dp[i-5]

    print(dp[n])
