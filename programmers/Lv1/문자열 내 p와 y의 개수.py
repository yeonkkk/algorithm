def solution(s):
    from collections import Counter
    counter = Counter(s.lower())
    return counter['p'] == counter['y'] 
