def solution(new_id):
    import re
    answer = new_id.lower()
    answer = re.sub(r'[^0-9a-z-_.]','', answer)
    answer = re.sub('(([.])\\2{1,})', '.', answer)
    answer = re.sub('^[.]', '', answer)
    answer = re.sub('[.]$', '', answer)
    if answer == '': answer = 'a'
    if len(answer) >= 16: answer = answer[:15]
    answer = re.sub('[.]$', '', answer)
    if len(answer) <= 2:
        t = answer[-1]
        while len(answer) != 3:
            answer += t 
    return answer
