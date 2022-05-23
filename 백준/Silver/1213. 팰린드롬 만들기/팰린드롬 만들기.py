from collections import Counter

str = input()
def solution(str):
    count = Counter(str).most_common()
    count.sort(key=lambda x: x[0])
    check_n, check_s = 0, ''
    result = ''

    for char, num in count:
        if num % 2 != 0:
            check_n += 1
            check_s = char
        if check_n > 1: return "I'm Sorry Hansoo"
        
        result += char * (num // 2)
        
    return result + check_s + result[::-1]

print(solution(str))