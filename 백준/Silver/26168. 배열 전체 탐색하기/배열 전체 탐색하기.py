import sys


n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

for _ in range(m):
    arr2 = list(map(int, sys.stdin.readline().split()))
    query_type = arr2[0]
    count = 0

    if query_type == 1:
        target = arr2[1]
        for num in arr:
            if target <= num:
                count += 1
    
    if query_type == 2:
        target = arr2[1]
        for num in arr:
            if target < num:
                count += 1

    if query_type == 3:
        target1 = arr2[1]
        target2 = arr2[2]
        for num in arr:
            if target1 <= num <= target2:
                count += 1
    
    print(count)