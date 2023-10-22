import sys

t = int(input())

for _ in range(t):
    n = int(input())
    result = list(input().split())
    result = list(filter(lambda x : result.count(x) == 6, result))

    teams = {}

    for i in range(len(result)):
        v = teams.get(result[i], [])
        v.append(i)
        teams[result[i]] = v
    
    winner = ""
    min_score = sys.maxsize
    for k in teams:
        v = teams[k]
        score = sum(v[:4])

        if score < min_score:
            min_score = score
            winner = k
            continue

        if score == min_score and v[4] < teams[winner][4]:
            min_score = score
            winner = k
    print(winner)
