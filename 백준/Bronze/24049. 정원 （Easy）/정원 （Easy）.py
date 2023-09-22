n, m = map(int, input().split())

row_flowers = list(map(int, input().split()))
col_flowers = list(map(int, input().split()))

for i in range(n):
    left_flower = row_flowers[i]
    for j in range(m):
        if left_flower == col_flowers[j]:
            left_flower = 0
        else:
            left_flower = 1
        col_flowers[j] = left_flower

print(col_flowers[m-1])
