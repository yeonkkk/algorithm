start_a, start_n = input()
start_a = ord(start_a)
start_n = int(start_n)

dx = [-1, -1, 1, 1, -2, -2, 2, 2]
dy = [-2, 2, -2, 2, -1, 1, -1, 1]

count = 0
for i in range(len(dx)):
    next_x = start_n + dx[i]
    next_y = start_a + dy[i]
    if 1 <= next_x <= 8 and ord('a') <= next_y <= ord('h'):
        count += 1
# print(ord('a'))
# print(ord('h'))
print(count)