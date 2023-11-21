from collections import deque

def solution(queue1, queue2):
    queue_size = len(queue1)
    queue1, queue2 = deque(queue1), deque(queue2)
    sum1, sum2 = sum(queue1), sum(queue2)
    total = sum1 + sum2
    if total % 2 != 0: return -1

    half = total / 2
    count = 0
    
    while sum1 != half:
        if sum1 == 0 or sum2 == 0: 
            return -1
        
        # 여기에 count 제한을 넣어줘야할 것 같음..
        if 3 * queue_size < count: return -1
        
        count += 1
        
        if  half < sum1:
            ele = queue1.popleft()
            queue2.append(ele)
            sum1 -= ele
            sum2 += ele
            continue
        
        if half < sum2:
            ele = queue2.popleft()
            queue1.append(ele)
            sum2 -= ele
            sum1 += ele
            continue
        
    return count
