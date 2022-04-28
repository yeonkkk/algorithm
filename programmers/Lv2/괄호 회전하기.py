def solution(s):
    l1, l2 = ['(', '{', '['], [')', '}', ']']
    def check(c, ns):
        for n in ns:
            if n in l1: c.append(n)
            elif c == []: return 0
            elif c.pop() != l1[l2.index(n)]: return 0
        return 0 if c else 1
    
    count = 0
    for i in range(len(s)):
        c, ns = [], s[i:] + s[:i]
        count += check(c, ns)
    return count
