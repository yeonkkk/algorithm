def solution(N, stages):
    stages.sort()
    check = []
    
    for i in range(N):
        if len(stages) <= 1:
            check.append((i+1, 0))
        else:
            c = stages.count(i+1)
            check.append((i+1, c/len(stages)))
            stages = stages[c:]

    check.sort(key=lambda x: x[1], reverse=True)
    return [i[0] for i in check]
