import sys, math

x, y = map(int, sys.stdin.readline().split())
origin = int((100 * y) / x)

if x != y and origin < 99:
    result = ((x * (origin + 1)) - (100 * y)) / (99 - origin)
    print(math.ceil(result))
else:
    print(-1)