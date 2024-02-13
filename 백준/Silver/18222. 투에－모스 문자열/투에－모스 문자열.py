import sys

# 투에-모스 수열
# t_0 = 0
# t_2n = t_n
# t_(2n+1) = 1 - t_2n

k = int(sys.stdin.readline())

def solution(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    elif n % 2 == 0:
        return solution(n // 2)
    else:
        return 1 - solution(n // 2)

print(solution(k-1))