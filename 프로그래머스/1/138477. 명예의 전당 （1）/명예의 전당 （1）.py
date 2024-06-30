def solution(k, score):
    score_status = []
    answer = []
    
    for single_score in score:
        score_status.append(single_score)
        score_status.sort(reverse=True)
        
        if len(score_status) < k:
            answer.append(score_status[-1])
            continue

        answer.append(score_status[k-1])
    
    return answer