def solution(lottos, win_nums):
    t, f= 0, 0
    for  num in lottos:
        if num in win_nums: t += 1
        elif num != 0: f += 1
    if f == 6: f = 5
    return [max(1+f, 1), min(7-t, 6)]
