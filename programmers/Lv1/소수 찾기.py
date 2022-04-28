# 에라토스테네스의 체 
def solution(n):
    import math
    prime_list = [True] * (n+1) # True 면 소수
    k = math.ceil(math.sqrt(n)) # n의 최대 약수 sqrt(n)
    for i in range(2, k + 1):
        if prime_list[i]:
            for j in range(i+i, n+1, i):
                prime_list[j] = False # i의 배수 모두 false로 바꾸기
                
    return prime_list.count(True) -2 # 0, 1에 해당하는 인덱스 제외
