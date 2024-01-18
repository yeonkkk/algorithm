import sys

input = sys.stdin.readline

n = int(input())

weights = []

for _ in range(n):
    weights.append(int(input()))

weights.sort()
max_total_weight = 0

for i, w in enumerate(weights):
    curr = w * (len(weights) - i)
    max_total_weight = max(curr, max_total_weight)

print(max_total_weight)