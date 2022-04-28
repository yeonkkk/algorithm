n = int(input())

list_a = []

for i in range(n):
    keys, value = input().split()
    list_a.append((keys, int(value)))

list_a = sorted(list_a, key = lambda student: student[1])

for student in list_a:
    print(student[0], end=" ")