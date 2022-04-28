n = int(input())

for _ in range(n):
    answers = list(input())
    result, cur = 0, 0
    for answer in answers:
        if answer == 'O':
            cur += 1
            result += cur
        else:
            cur = 0
    print(result)
