def solution(left, right):
    result = 0
    for num in range(left, right+1):
        count = 1
        for i in range(1, num):
            if num % i == 0: count += 1
            
        if count % 2 == 0: result += num 
        else: result -= num
    return result
