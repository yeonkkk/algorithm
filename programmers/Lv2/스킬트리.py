def solution(skill, skill_trees):
    answer = 0
    for tree in skill_trees:
        result = ''
        for s in tree:
            if s in skill: result += s
        if result == '' or result[0] == skill[0] and result in skill: answer += 1
    return answer
