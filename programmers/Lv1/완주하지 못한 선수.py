def solution(p, c):
    from collections import Counter
    counter = Counter(p) - Counter(c)
    return list(counter.keys())[0]
