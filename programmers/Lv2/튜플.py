def solution(s):
    from collections import Counter
    result = ''
    for i in s:
        if i != '{' and i != '}': result += i
    counter = Counter(result.split(',')).most_common()
    return [int(n[0]) for n in counter]
