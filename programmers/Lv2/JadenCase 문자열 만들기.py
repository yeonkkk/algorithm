def solution(s):
    sl = list(s.lower())
    result = ''
    count = 0
    for c in sl:
        if count == 0 and c.isalpha():
            result += c.upper()
            count += 1
        elif c == ' ':
            result += c
            count = 0
        else:
            result += c
            count += 1
    return result
