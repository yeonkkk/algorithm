def solution(d, b):
    d.sort()
    result = 0
    for c in d:
        if c <= b:
            result += 1
            b -= c
        else:
            break
    return result
