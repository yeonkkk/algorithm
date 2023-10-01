def solution(s):
    result = []
    for i in range(len(s)):
        index = -1
        for j in range(0, i):
            if s[i] == s[j]: index = i-j
        result.append(index)
        
    return result