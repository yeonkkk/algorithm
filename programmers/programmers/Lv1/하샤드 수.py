def solution(x):
    x_list = map(int, list(str(x)))
    if x % sum(x_list) == 0:
        return True
    else: 
        return False
