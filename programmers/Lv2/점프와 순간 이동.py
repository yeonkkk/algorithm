def solution(n):
    count = 1
    while True:
        if n == 1: break
        elif n % 2 == 0: n = n//2
        else:
            n -= 1
            count +=1
    return count
