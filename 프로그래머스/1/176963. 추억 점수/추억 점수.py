def solution(name, yearning, photo):
    people_score = {}
    for i in range(len(name)):
        people_score[name[i]] = yearning[i]
        
    answer = []
    for p in photo:
        count = 0
        for s in p:
            count += people_score.get(s, 0)
        answer.append(count)
        
    return answer