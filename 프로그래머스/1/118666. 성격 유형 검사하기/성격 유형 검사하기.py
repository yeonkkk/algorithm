def solution(survey, choices):
    types = [['R', 'T'],
             ['C', 'F'],
            ['J', 'M'],
            ['A', 'N']]
    choice_score = [0, 3, 2, 1, 0, 1, 2, 3]
    
    score = {}
    for type in types:
        score[type[0]] = 0
        score[type[1]] = 0
    
    for i in range(len(survey)):
        current_result = survey[i]
        current_choice = choices[i]
        
        if current_choice == 4:
            continue
        elif current_choice < 4:
            score[current_result[0]] += choice_score[current_choice]
        else:
            score[current_result[1]] += choice_score[current_choice]
    
    answer = ''
    for type_pair in types:
        if score[type_pair[0]] > score[type_pair[1]]:
            answer += type_pair[0]
        elif score[type_pair[0]] < score[type_pair[1]]:
            answer += type_pair[1]
        else:
            answer += sorted(type_pair)[0]
            
        
    return answer