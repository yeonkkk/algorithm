def solution(t, p):
    length = len(p)
    left = 0
    right = left + length
    count = 0
    
    while right <= len(t):
        if t[left:right] <= p: count += 1
        left += 1
        right += 1
        
    return count