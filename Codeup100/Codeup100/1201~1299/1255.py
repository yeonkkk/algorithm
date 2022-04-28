a, b = map(float, input().split())

while a <= b:
    print(format(a, ".2f"), end=' ')
    a += 0.01