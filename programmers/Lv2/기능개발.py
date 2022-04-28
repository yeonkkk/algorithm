def solution(progresses, speeds):
    from math import ceil
    answer = []
    days = [ceil((100 - p)/speeds[i]) for i, p in enumerate(progresses)]
    
    for i, d in enumerate(days):
        if i == 0: cur, count = d, 1
        elif cur >= d: count += 1
        else:
            answer.append(count)
            count, cur = 1, d
        
        if i + 1 == len(days): answer.append(count)
    return answer
