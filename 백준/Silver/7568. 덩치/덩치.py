n = int(input())
people = []
level = []
for _ in range(n):
    size = tuple(map(int, input().split()))
    people.append(size)

for person in people:
    count = 1
    for other in people:
        if person == other: continue
        if (other[0] > person[0]) and (other[1] > person[1]): count += 1
    level.append(count)

for i in range(len(level)):
    print(level[i], end=" ")