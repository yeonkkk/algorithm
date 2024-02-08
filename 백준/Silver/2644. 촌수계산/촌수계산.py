import sys
from collections import defaultdict

input = sys.stdin.readline

n = int(input())
src, des = map(int, input().split())
m = int(input())

graph = defaultdict(list)
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

count = -1

def dfs(start, visited, current_count):
    global count
    
    if start == des:
        count = current_count
        return
    
    visited[start] = True

    for node in graph[start]:
        if not visited[node]:
            dfs(node, visited, current_count + 1)

visited = [False] * (n + 1)
dfs(src, visited, 0)

print(count)
