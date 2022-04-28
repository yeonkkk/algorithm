def solution(answers):
    f = [1, 2, 3, 4, 5]
    s = [2, 1, 2, 3, 2, 4, 2, 5]
    t = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    count_list = [0, 0, 0]
    for i, a in enumerate(answers):
        if a == f[i%5]: count_list[0] += 1
        if a == s[i%8]: count_list[1] += 1
        if a == t[i%10]: count_list[2] += 1
    
    result = []
    k = max(count_list)
    for i, num in enumerate(count_list):
        if num == k: result.append(i + 1)
    return result
