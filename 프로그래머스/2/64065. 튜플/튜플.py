from collections import Counter
def solution(s):
    s = s.replace('{', '')
    s = s.replace('}', '')
    
    count = Counter(s.split(','))
    most_common = count.most_common()
    
    return [int(value[0]) for value in most_common]
    
    