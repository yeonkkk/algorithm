import sys
from collections import defaultdict

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())
nodes = defaultdict(list)

for _ in range(n - 1):
    node1, node2 = map(int, input().split()) 
    nodes[node1].append(node2)
    nodes[node2].append(node1)

visited = [0] * (n + 1) 

def dfs(start):
    for node in nodes[start]:
        if visited[node] == 0:
            visited[node] = start
            dfs(node)

dfs(1)

for i in range(2, n + 1):
    print(visited[i])