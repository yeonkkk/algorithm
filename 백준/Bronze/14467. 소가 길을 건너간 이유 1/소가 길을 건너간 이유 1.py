import sys

input = sys.stdin.readline

n = int(input())

status = [-1 for _ in range(n)]
count = [0 for _ in range(n)]

for _ in range(n):
    num, position = map(int, input().split())
    idx = num - 1
    if status[idx] == -1:
        status[idx] = position
        continue
    
    if status[idx] != position:
        status[idx] = position
        count[idx] += 1

print(sum(count))
