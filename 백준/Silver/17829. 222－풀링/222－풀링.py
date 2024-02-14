import sys

n = int(sys.stdin.readline())
square = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

def pooling(n, x, y):
    global square
    
    if n == 2:
        nums = [square[x][y],
            square[x][y + 1],
            square[x + 1][y],
            square[x + 1][y + 1]]

        nums.sort(reverse=True)
        return nums[1]
    
    half = n // 2
    top_left = pooling(half, x, y)
    top_right = pooling(half, x + half, y)
    bottom_left = pooling(half, x, y + half)
    bottom_right = pooling(half, x + half, y + half)
    
    nums = [top_left, top_right, bottom_left, bottom_right]
    nums.sort(reverse=True)
    return nums[1]

print(pooling(n, 0, 0))