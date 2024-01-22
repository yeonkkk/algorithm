import sys

input = sys.stdin.readline

n = int(input())

memo = [0] * (n + 1)

if n <= 1:
    print(n)
else:
    memo[1] = 1
    for i in range(2, n + 1):
        memo[i] = memo[i - 2] + memo[i - 1]
    print(memo[n])