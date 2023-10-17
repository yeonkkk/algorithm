def solution(s):
    count = 0
    for char in s:
        if count < 0: return False
    
        if char == '(': 
            count += 1
            continue
        else:
            count -= 1
            
    return count == 0
            