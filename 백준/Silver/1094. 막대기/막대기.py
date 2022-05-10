x = int(input())

def solution(x, n):
    import heapq
    
    bar_list = []
    heapq.heappush(bar_list, n)
    while sum(bar_list) != x:
        temp = bar_list[0]
        if sum(bar_list) - temp/2 >= x:
            heapq.heappop(bar_list)
            heapq.heappush(bar_list, temp//2) 
        else:
            heapq.heappop(bar_list)
            heapq.heappush(bar_list, temp//2)
            heapq.heappush(bar_list, temp//2)
            
    return len(bar_list)

print(solution(x, 64))