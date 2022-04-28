n = int(input())
s = 0
for i in range(1, n+1):
    if i % 10 == 1:
        s += 1

print(s)