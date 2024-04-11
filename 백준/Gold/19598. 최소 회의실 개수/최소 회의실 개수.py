import sys
import heapq

input = sys.stdin.readline

class Room:
    def __init__(self, start, end) -> None:
        self.start = start
        self.end = end

    def is_next(self, end_time):
        return end_time <= self.start

    # compareTo
    def __lt__(self, other):
        if self.start == other.start:
            return self.end < other.end
        return self.start < other.start

def solution(n, rooms):
    rooms.sort()
    queue = []
    heapq.heappush(queue, rooms[0].end)

    for i in range(1, n):
        room = rooms[i]
        if queue and room.is_next(queue[0]):
            heapq.heappop(queue)
        heapq.heappush(queue, room.end)

    return len(queue)

# ----- 입력 & 출력 -----
n = int(input())
rooms = [Room(*map(int, input().split())) for _ in range(n)]

print(solution(n, rooms))