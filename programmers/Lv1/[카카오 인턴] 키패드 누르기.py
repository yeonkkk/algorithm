def solution(numbers, hand):
    keypad = {1: (0, 0), 2: (0, 1), 3: (0, 2),
              4: (1, 0), 5: (1, 1),6: (1, 2), 
              7: (2, 0), 8:(2, 1), 9:(2, 2), 
              0: (3, 1)}
    l, r = (3, 0), (3, 2)
    result = ''
    
    for i in numbers:
        xy = keypad[i]
        if i in [1, 4, 7]:
            result += 'L'
            l = xy
        elif i in [3, 6, 9]:
            result += 'R'
            r = xy
        else:
            ld = abs(l[0]-xy[0]) + abs(l[1]-xy[1])
            rd = abs(r[0]-xy[0]) + abs(r[1]-xy[1])
            
            if ld < rd:
                l = xy
                result += 'L'
            elif ld > rd:
                r = xy
                result += 'R'
            else:
                if hand == 'left':
                    l = xy
                    result += 'L'
                else:
                    r = xy
                    result += 'R'
    return result
