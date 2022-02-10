def solution():
    N, M = map(int, input().split())
    result = 0
    for _ in range(N):
        num_list = list(map(int, input().split()))
        num_list.sort() # 시간복잡도 줄이려면 min이 나을 것이당
        result = max(result, num_list[0])
    return result

print(solution())

'''
3 3
3 1 2
4 1 4
2 2 2

2 4
7 3 1 8
3 3 3 4
'''