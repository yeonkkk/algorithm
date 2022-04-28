num = list(map(int, input().split()))

for i in num:
    if i < 0:
        if i % 2 == 0:
            print("A")
        else:
            print("B")
    else:
        if i % 2 == 0:
            print("C")
        else:
            print("D")