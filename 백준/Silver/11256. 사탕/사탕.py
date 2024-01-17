import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t): 
    j, n = map(int, input().split())

    box_size = []
    for _ in range(n):
        r, c = map(int, input().split())
        box_size.append(r * c)
    
    box_size.sort(reverse=True)
    count = 0
    for size in box_size:
        if 0 < j:
            j -= size
            count += 1
        else:
            break
    
    print(count)