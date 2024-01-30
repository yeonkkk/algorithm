import sys

input = sys.stdin.readline
n = int(input())

dp = [0] * (n+1)

for i in range(2, n + 1):
    dp[i] = dp[i-1] + dp[i-2] + 2

print((dp[n] + 1) % 1_000_000_007)