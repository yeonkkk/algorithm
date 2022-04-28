def solution(n, m):
    if n > m: n, m = m, n
    a, b = m, n
    while True:
        mod = a % b
        if mod == 0 : break
        a, b = b, mod
    return [b, m*n/b]
