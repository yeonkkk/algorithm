def solution(number):
    answer = 0

    for i in range(len(number)):
        for j in range(i, ):
            for k in range(j, ):
                if number[i] + number[j] + number[k] == 0: answer += 1
    
    return answer