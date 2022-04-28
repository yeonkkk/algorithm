def solution(x, n):
    answer = []
    y = 0
    for _ in range(n):
        y += x
        answer.append(y)
    return answer
