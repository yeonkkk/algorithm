def solution(clothes):
    from collections import defaultdict
    check = defaultdict(int)
    
    for v, k in clothes:
        check[k] += 1
    
    count = 1
    for i in list(check.values()):
        count *= (i + 1)
    
    return  count - 1
