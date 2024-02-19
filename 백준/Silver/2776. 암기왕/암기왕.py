import sys

def binary_search(note1, target):
    start_idx = 0
    end_idx = len(note1) - 1

    while start_idx <= end_idx:
        middle_idx = (start_idx + end_idx) // 2

        if target == note1[middle_idx]:
            print(1)
            return
        
        if target < note1[middle_idx]:
            end_idx = middle_idx - 1
        else:
            start_idx = middle_idx + 1

    print(0)

t = int(sys.stdin.readline())

for _ in range(t):
    # 입력
    n = int(sys.stdin.readline())
    note1 = list(map(int, sys.stdin.readline().split()))
    m = int(sys.stdin.readline())
    note2 = list(map(int, sys.stdin.readline().split()))

    note1.sort()

    for target in note2:
        binary_search(note1, target)
