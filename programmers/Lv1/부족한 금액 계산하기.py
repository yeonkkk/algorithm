def solution(p, m, c):
    result = 0
    for i in range(1, c+1):
        result += p * i
    return 0 if m > result else abs(result-m)
