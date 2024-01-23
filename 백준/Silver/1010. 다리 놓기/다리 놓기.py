import sys

input = sys.stdin.readline

t = int(input())

graph = [[0] * 30 for _ in range(30)]

for i in range(30):
    graph[i][i] = 1
    graph[i][0] = i + 1
    graph[0][i] = i + 1

for _ in range(t):
    point = list(map(int, input().strip().split()))
    point.sort()

    for i in range(point[0] + 1):
        for j in range(point[1] + 1):
            if graph[i][j] != 0 or j < i:
                continue
            
            graph[i][j] = graph[i-1][j-1] + graph[i][j-1]
    print(graph[point[0] - 1][point[1] - 1])