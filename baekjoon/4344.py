c = int(input())

for _ in range(c):
    input_list = list(map(int, input().split()))
    n, score_list = input_list[0], input_list[1:]
    avg = int(sum(score_list) / n)
    pass_num = 0
    for score in score_list:
        if score > avg: pass_num += 1
    print(f'{pass_num / n * 100:.3f}%')
