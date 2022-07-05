import sys
input = sys.stdin.readline

count = 0
n, m = map(int, input().split())
S = set(input().strip() for _ in range(n))

for _ in range(m):
    cur = input().strip()
    if cur in S: count += 1
    
print(count)