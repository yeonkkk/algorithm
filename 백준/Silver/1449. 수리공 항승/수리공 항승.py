import sys
input = sys.stdin.readline

n, l = map(int, input().split())
locations = list(map(int, input().split()))
locations.sort()

count = 0
current_end_point = 0
for location in locations:
    if current_end_point < location:
        count += 1
        current_end_point = location + l - 0.5

print(count)