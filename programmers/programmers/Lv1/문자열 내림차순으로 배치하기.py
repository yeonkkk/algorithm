def solution(s):
    u_list = ''
    l_list = ''
    for i in s: 
        if i.isupper(): u_list += i
        else: l_list += i
    return ''.join(sorted(l_list, reverse=True)) + ''.join(sorted(u_list, reverse=True))
