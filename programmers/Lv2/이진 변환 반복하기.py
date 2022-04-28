def solution(s):
    import re
    answer = [0,0]
    while True:
        answer[0] += 1
        answer[1] += s.count('0')
        s = re.sub(r'[0]', '', s)
        if s == '1': break
        s = bin(len(s))[2:]
    return answer
