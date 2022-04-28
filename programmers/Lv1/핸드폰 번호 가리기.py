def solution(number):
    answer = '*' * (len(number)-4) + number[-4:]
    return answer
