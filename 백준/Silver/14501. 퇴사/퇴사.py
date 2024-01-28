import sys

input = sys.stdin.readline

n = int(input())
days = [list(map(int, input().split())) for i in range(n)]
days = days[::-1]
dp = [0] * (n + 1)

for i in range(n):
    t, p = days[i]
    if i - t + 1 < 0:
        dp[i + 1] = dp[i]
        continue
    else:
        dp[i + 1] = max(dp[i], dp[i - t + 1] + p)

print(dp[-1])