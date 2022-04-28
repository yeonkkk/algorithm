# N, M, K = 5, 8, 3
# num_list = [2, 4, 5, 4, 6]
N, M, K = map(int, input().split())
num_list = map(int, input().split())

def solution(N, M, K, num_list):
    result = 0
    num_list.sort()
    for i in range(1, M+1):
        if i % K != 0:
            result += num_list[-1]
        else:
            result += num_list[-2]
    return result

print(solution(N, M, K, num_list))

