def solution(a, s):
    result = 0
    for i, num in enumerate(a):
        if s[i]: result += num
        else: result += (-1)*num
    return result
