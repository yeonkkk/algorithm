import sys

input = sys.stdin.readline

n = int(input())
colors = input().strip()

b_count = 0
r_count = 0

for i, color in enumerate(colors):
    if (i == 0) or (colors[i - 1] != colors[i]):
        if colors[i] == 'B':
            b_count += 1
        else:
            r_count += 1

print(min(b_count, r_count) + 1)