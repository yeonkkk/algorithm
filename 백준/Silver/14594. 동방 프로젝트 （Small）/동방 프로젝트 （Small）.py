n = int(input())
m = int(input())

rooms =[0 for _ in range(n)]

for _ in range(m):
    start, end = map(int, input().split())

    for i in range(start, end):
        rooms[i] = 1

print(rooms.count(0))