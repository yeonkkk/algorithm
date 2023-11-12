import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

t = int(input())

def execute():
    m, n, k = map(int, input().split())
    baechu = []
    graph = [[0] * m for _ in range(n)]
    count = 0

    for _ in range(k):
        y, x = tuple(map(int, input().split()))
        baechu.append((x, y))
        graph[x][y] = 1

    def dfs(graph, x, y):
        if x < 0 or y < 0 or n <= x or m <= y or graph[x][y] == 0: 
            return

        graph[x][y] = 0
        dfs(graph, x + 1, y)
        dfs(graph, x - 1, y)
        dfs(graph, x, y + 1)
        dfs(graph, x, y - 1)
        
    for point in baechu:
        if graph[point[0]][point[1]] == 0: continue
        count += 1
        dfs(graph, point[0], point[1])

    print(count)
    
for _ in range(t):
    execute()