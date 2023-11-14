import sys
input = sys.stdin.readline

n, m = map(int, input().split())
table = [list(map(int, input().split())) for _ in range(2)]
answer = 0

def dfs(pre_location, days, total):
    if days == n:
        if m <= total: 
            global answer
            answer += 1
        return
    
    for i in range(2):
        for j in range(3):
            new_score = (table[i][j]/2) if pre_location == j else table[i][j]
            dfs(j, days + 1, total + new_score)

dfs(-1, 0, 0)
print(answer)