def solution(k, dungeons):
    from itertools import permutations
    result = 0
    per = permutations(dungeons, len(dungeons))
    for p in per:
        nk = k
        count = 0
        for i in p:
            if i[0] <= nk:
                nk -= i[1]
                count += 1
        result = max(result, count)
    return result
