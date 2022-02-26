def solution(n, l, r):
    answer = []    
    for i in range(l, r + 1):
        answer.append(max(i // n, i % n) + 1)
    return answer
