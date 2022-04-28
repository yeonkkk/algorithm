def solution(n, l, r):
    answer = 0
    for i in range(1, n+1):
        if i in l:
            if i in r: 
                answer += 1
                r.remove(i)
            elif i-1 in r and i-1 not in l:
                answer += 1
                r.remove(i-1)
            elif i+1 in r and i+1 not in l:
                answer += 1
                r.remove(i+1)
        else:
            answer += 1    
    return answer
