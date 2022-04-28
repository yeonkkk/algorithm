def solution(dR):
    dR = dR.replace('10', 'N')
    result = []
    for i, s in enumerate(dR):
        if s == 'N': s = '10'     
        if s.isdigit():
            k = int(s)
            if dR[i+1] == 'D': k **= 2
            elif dR[i+1] == 'T': k **= 3
            result.append(k)
            
        if i ==2 and s == '*':
            r1 = result.pop()*2
            result.append(r1)
        elif i != 2 and s == '*':
            r1 = result.pop()*2
            r2 = result.pop()*2
            result.append(r2)
            result.append(r1)
        elif s == '#':
            result.append(result.pop()*(-1))
    return sum(result)
