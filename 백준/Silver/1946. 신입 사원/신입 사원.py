import sys

t = int(sys.stdin.readline().strip())

for _ in range(t):
    n = int(sys.stdin.readline().strip())

    scores = [tuple(map(int, sys.stdin.readline().strip().split())) for _ in range(n)]
    scores.sort()

    count = 0
    min = n + 1

    for score in scores:
        if score[1] < min:
            count += 1
            min = score[1]
            continue

    print(count)
