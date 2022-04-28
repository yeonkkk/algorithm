def solution(n):
    word = '수박' 
    if n % 2 == 0:
        answer = word*(n//2)
    else:
        answer = word*(n//2) + '수' 
    return answer
