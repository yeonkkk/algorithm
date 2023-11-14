import sys
input = sys.stdin.readline

t = int(input())
counts = [[0] * 10, [1] * 10]

def count_nums(num):
    if len(counts) <= num:
        count_nums(num - 1)
    else:
        new = []
        for i in range(10):
            new.append(sum(counts[num][i:]))
        counts.append(new)

for _ in range(t):
    n = int(input())
    if len(counts) <= n:
        count_nums(n)
    print(sum(counts[n]))