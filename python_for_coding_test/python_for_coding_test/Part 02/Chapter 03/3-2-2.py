n, m, k = map(int, input().split())
num_list = list(map(int, input().split()))

num_list.sort()
first = num_list[n-1]
second = num_list[n-2]

# 가장 큰 수가 더해지는 횟수 계산
count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
result += (count) * first # 가장 큰 수 더하기
result += (m-count) * second # 두 번째로 큰 수 더하기

print(result)
