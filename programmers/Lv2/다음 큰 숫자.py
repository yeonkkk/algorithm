def solution(n):
    k = n 
    while True:
        k += 1
        if bin(k).count('1') == bin(n).count('1'): return k
