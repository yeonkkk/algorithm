n = int(input())
prices = [tuple(map(int, input().split())) for _ in range(n)]

result_price = 0
total = 0
for current in prices:
    count = 0
    for other in prices:
        if other[0] < current[0] or current[0] - other[1] < 0: continue
        count += current[0] - other[1]
    if count > total:
        total = count
        result_price = current[0]
    if count == total and current[0] < result_price: result_price = current[0]

print(result_price)