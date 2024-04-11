import sys
from collections import deque

input = sys.stdin.readline

# ----- 풍선 객체 -----
class Balloon:
    def __init__(self, index, paper_value):
        self.index = index
        self.paper_value = paper_value

    def turn_right(self):
        return self.paper_value > 0

    def get_turn_count(self):
        return abs(self.paper_value)

def solution(n, values):
    result = []
    balloon_deque = deque([Balloon(i + 1, values[i]) for i in range(n)])

    while balloon_deque:
        balloon = balloon_deque.popleft()
        result.append(balloon.index)

        if balloon.turn_right():
            for _ in range(balloon.get_turn_count() - 1):
                if balloon_deque:
                    balloon_deque.append(balloon_deque.popleft())
        else:
            for _ in range(balloon.get_turn_count()):
                if balloon_deque:
                    balloon_deque.appendleft(balloon_deque.pop())

    return result

# ----- 입력 & 출력 -----
n = int(input())
balloon_values = list(map(int, input().split()))
result = solution(n, balloon_values)

print(' '.join(map(str, result)))