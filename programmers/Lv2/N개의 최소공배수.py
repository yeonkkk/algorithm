def solution(arr):
    def gcd(m, n):
        if n > m: m, n == n, m
        while True:
            mod = m % n
            if mod == 0: break
            m, n = n, mod
        return n
    m = arr[0]
    for e in arr:
        m = e * m / gcd(e, m)
    return m
