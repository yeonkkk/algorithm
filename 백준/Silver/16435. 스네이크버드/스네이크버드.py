import sys

input = sys.stdin.readline

n, length = map(int, input().split())
h_list = list(map(int, input().split()))
h_list.sort()

for h in h_list:
    if h <= length:
        length += 1

print(length)