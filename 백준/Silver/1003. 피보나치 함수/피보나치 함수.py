import sys

input = sys.stdin.readline

t = int(input())
dp_0 = [0] * 41
dp_1 = [0] * 41
dp_0[0] = 1
dp_1[1] = 1

for _ in range(t):
    n = int(input())
    for i in range(2, n + 1):
        dp_0[i] = dp_0[i-1] + dp_0[i-2]
        dp_1[i] = dp_1[i-1] + dp_1[i-2]

    print(dp_0[n], dp_1[n])

