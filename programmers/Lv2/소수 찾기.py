def solution(n):
    from itertools import permutations
    nl = []
    for r in range(1, len(n)+1):
        per = list(permutations(n, r))
        nl += [int(''.join(p)) for p in per]   
        
    nl = set(nl)
    count = 0
    
    for nm in nl: 
        if nm == 0 or nm == 1: 
            count += 1
            continue
        for i in range(2, int(nm**0.5) + 1):
            if  nm % i == 0: 
                count += 1 
                break
    return len(nl) - count
