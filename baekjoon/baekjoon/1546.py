n = int(input())
score_list = list(map(int, input().split()))
max_score = max(score_list)

new_sum = sum(score_list)* 100 / max_score 
print(new_sum/n)
