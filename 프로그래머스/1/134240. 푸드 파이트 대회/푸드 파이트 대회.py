def solution(food):
    half = ''
    for i, food_num in enumerate(food):
        if food_num == 0:
            continue
        count = food_num // 2
        half += str(i) * count
    
    return half + '0' + half[::-1]