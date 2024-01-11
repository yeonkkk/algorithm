import sys

input = sys.stdin.readline

n, k = map(int, input().split())
distances = list(map(int, input().split()))

for i in range(n):
    k -= distances[i]
    if k < 0:
        print(i + 1)
        break

if 0 <= k:
    for i in range(n-1,-1,-1):
        k -= distances[i]
        if k <= 0:
            print(i + 1)
            break