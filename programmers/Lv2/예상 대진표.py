def change_num(k):
    from math import ceil
    if k % 2 == 0: return k//2  
    else: return ceil(k/2) 
    
def solution(n,a,b):
    count = 0
    while True:
        count += 1
        if (a+b) % 4 == 3 and abs(a-b) == 1: return count
        else: a, b = change_num(a), change_num(b)
