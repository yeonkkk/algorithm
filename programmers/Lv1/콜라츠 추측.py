def solution(num):
    answer = 0
    for _ in range(500):
        if num == 1:
            return answer
        elif num % 2 == 0:
            num /= 2
            answer += 1
        else: 
            num = num * 3 + 1
            answer += 1
    return -1
