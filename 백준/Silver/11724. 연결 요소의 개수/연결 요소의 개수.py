import sys
from collections import defaultdict

sys.setrecursionlimit(10**6)

input = sys.stdin.readline

n, m = map(int, input().split())

graph = defaultdict(list)
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

def dfs(start, visited):
    visited[start] = True

    for node in graph[start]:
        if not visited[node]:
            dfs(node, visited)

visited = [False] * (n + 1)
count = 0
for i in range(1, n + 1):
    if visited[i]:
        continue

    dfs(i, visited)
    count += 1

print(count)