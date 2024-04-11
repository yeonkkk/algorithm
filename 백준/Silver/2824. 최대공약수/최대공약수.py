import sys
from math import prod

input = sys.stdin.readline

def gcd(a, b):
    while 0 < b:
        a, b = b, a % b
    return a

def solution(a, b):
    result = str(gcd(a, b))

    if 9 < len(result):
        return str(result)[-9:]
    else:
        return result

# ----- 입력 & 출력 -----
n = int(input())
a = prod(list(map(int, input().split())))
m = int(input())
b = prod(list(map(int, input().split())))

print(solution(a, b))