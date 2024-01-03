import sys
input = sys.stdin.readline

check = [i for i in range(1, 31)]

for _ in range(28):
    num = int(input())
    check.remove(num)

for num in check:
    print(num)