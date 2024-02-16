import sys

n = int(sys.stdin.readline())
graph = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

white_count = 0
blue_count = 0

def divider(n, x, y):
    global graph, white_count, blue_count

    total_sum = 0
    for i in range(x, x + n):
        total_sum += sum(graph[i][y: y + n])
    
    if total_sum == 0:
        white_count += 1
        return
    
    if total_sum == n * n:
        blue_count += 1
        return

    half = n // 2

    divider(half, x, y)
    divider(half, x + half, y)
    divider(half, x + half, y + half)
    divider(half, x, y + half)

divider(n, 0, 0)
    
print(white_count)
print(blue_count)