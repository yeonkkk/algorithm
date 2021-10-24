n, m = map(int, input().split())

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    # 가장 작은 수 찾기
    min_value = min(data)
    # 작은 수 중 큰 수 찾기
    result = max(result, min_value)

print(result)
