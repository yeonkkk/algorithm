import sys

input = sys.stdin.readline
n = int(input())

game_map = [list(map(int, input().split())) for _ in range(n)]
stack = [(0, 0)]
current_num = 0

while len(stack) != 0 and current_num != -1:
    x, y = stack.pop()
    current_num = game_map[x][y]

    if current_num == 0: break

    if x + current_num < n: stack.append((x + current_num, y))
    if y + current_num < n: stack.append((x, y + current_num))

print("HaruHaru" if current_num == -1 else "Hing")

