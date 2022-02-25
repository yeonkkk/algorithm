def solution(nums):
    count = 0
    from itertools import combinations
    com = list(combinations(nums, 3))
    for i in range(len(com)):
        k = sum(com[i])
        for j in range(2, k):
            if k % j == 0:
                count +=1
                break
    return len(com) - count
