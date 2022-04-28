import sys

n =  int(sys.stdin.readline())

for _ in range(n):
    print(sum(map(int, sys.stdin.readline().split())))
