import math

def count_factors(number):
    count = 0
    
    for i in range(1, int(math.sqrt(number)) + 1):
        if number % i == 0:
            count += 1
            if i * i != number:
                count += 1
        
    return count
                
def solution(number, limit, power):
    answer = 0
            
    for i in range(1, number + 1):
        factor_amount = count_factors(i)
        
        if factor_amount <= limit:
            answer += factor_amount
            continue
        answer += power  

    return answer