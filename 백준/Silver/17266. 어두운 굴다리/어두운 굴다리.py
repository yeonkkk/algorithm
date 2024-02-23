import sys, math

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
locations = list(map(int, sys.stdin.readline().split()))

max_h = max(locations[0], n - locations[-1])

for i in range(1, m):
    pre = locations[i-1]
    current = locations[i]
    max_h = max(max_h, math.ceil((current - pre)/2))

print(max_h)