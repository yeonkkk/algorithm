import sys

def bs(target):
    global n, thrs

    start = 0
    end = n - 1

    while start < end:
        mid = (start + end) // 2
        
        if thrs[mid] >= target:
            end = mid
        else:
            start = mid + 1
    return start

n, m = map(int, sys.stdin.readline().split())
names = []
thrs = []

for _ in range(n):
    name, thr = sys.stdin.readline().split()
    names.append(name)
    thrs.append(int(thr))

for _ in range(m):
    target = int(sys.stdin.readline())
    idx = bs(target)
    print(names[idx])