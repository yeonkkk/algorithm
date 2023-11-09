import sys

input = sys.stdin.readline

def dfs(graph, i, visited):
    visited[i] = True

    for v in graph[i]:
        if not visited[v]:
            dfs(graph, v, visited)

n = int(input())
pair_size = int(input())

graph = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)

for _ in range(pair_size):
    start, end = map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)

dfs(graph, 1, visited)

print(visited.count(True) - 1)