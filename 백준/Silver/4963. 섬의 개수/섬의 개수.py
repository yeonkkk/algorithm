import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

dy = [0, 0, 1, -1, 1, 1, -1, -1]
dx = [1, -1, 0, 0, 1, -1, 1, -1]

def dfs(graph, x, y):
    graph[y][x] = 0

    for i in range(len(dx)):
        new_x = x + dx[i]
        new_y = y + dy[i]

        if new_x >= w or new_x < 0 or new_y < 0 or new_y >= h:
            continue

        if graph[new_y][new_x] == 0:
            continue

        dfs(graph, new_x, new_y)

while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0: break
    graph = [list(map(int, input().split())) for _ in range(h)]

    count = 0
    for y in range(h):
        for x in range(w):
            if graph[y][x] == 0: continue
            dfs(graph, x, y)
            count += 1
    
    print(count)