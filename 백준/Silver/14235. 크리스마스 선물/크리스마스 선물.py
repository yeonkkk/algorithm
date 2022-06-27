import heapq

n = int(input())
heap = []
temp = []

for _ in range(n):

    cur = input()
    if len(cur) == 1:
        if heap: print(heapq.heappop(heap)[1])
        else: print(-1)
    else:
        temp = list(map(int, cur.split()))
        for i in range(1, len(temp)): 
            heapq.heappush(heap, (-temp[i], temp[i]))