import sys

def find_index(arr, target):
    start, end = -1, len(arr)

    while start + 1 < end:
        mid = (start + end) // 2

        if target <= arr[mid]:
            end = mid
        else:
            start = mid

    return end

def find_last_index(arr, target):
    start, end = -1, len(arr)

    while start + 1 < end:
        mid = (start + end) // 2

        if arr[mid] <= target:
            start = mid
        else:
            end = mid

    return end

n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

for _ in range(m):
    arr2 = list(map(int, sys.stdin.readline().split()))
    query_type = arr2[0]

    if query_type == 1:
        idx = find_index(arr, arr2[1])
        print(n-idx)
    elif query_type == 2:
        idx = find_index(arr, arr2[1] + 1)
        print(n-idx)
    else:
        idx1 = find_index(arr, arr2[1])
        idx2 = find_last_index(arr, arr2[2])
        print(idx2 - idx1)