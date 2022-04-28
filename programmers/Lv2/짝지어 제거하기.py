def solution(s):
    check = []
    for i in s:
        if check == []: check.append(i)
        elif check[-1] == i: check.pop()
        else: check.append(i)
    return 0 if len(check) >= 1 else 1
