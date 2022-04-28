def solution(s):
    s_list = list(s)
    count = 0
    for idx, c in enumerate(s_list):
        if c == ' ': 
            count = 0
            continue
               
        elif count % 2 == 0: 
            s_list[idx] = c.upper()
            count += 1
            
        else: 
            s_list[idx] = c.lower()
            count += 1
        
    return ''.join(s_list)
