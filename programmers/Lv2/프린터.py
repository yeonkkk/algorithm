def solution(pri, loc):
    from collections import deque
    from functools import reduce
    answer, check = 0, deque([(v, i) for i, v in enumerate(pri)])
    while check:
        k = check.popleft()
        max_ = reduce(lambda x, y: max(x, y[0]), check, 0)
        if check and k[0] < max_: check.append(k)
        else:
            answer += 1
            if loc == k[1]: return answer
