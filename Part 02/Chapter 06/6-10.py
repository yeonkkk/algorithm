n = int(input())
list_a = []
for i in range(n):
    list_a.append(int(input()))

list_a.sort(reverse=True)

for i in list_a:
    print(i, end =" ")