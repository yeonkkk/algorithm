def solution(s, n):
    s = list(s)
    for i, c in enumerate(s):
        if not c.isalpha(): continue
        elif c.isupper(): s[i] = chr((ord(c)-ord('A')+ n)%26 + ord('A'))
        else: s[i] = chr((ord(c)-ord('a')+ n)%26 + ord('a')) 
    return ''.join(s)
