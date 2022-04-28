n, m, k = map(int, input().split())
num_list = list(map(int, input().split()))
num_list.sort(reverse=True)
count = 0

while True:
    for i in range(k): # 가장 큰 수 k번 더하기
        if m == 0:
            break
        count += num_list[0]
        m -= 1
    if m == 0: 
        break
    count += num_list[1] # 두번째로 큰 수 한 번 더ㅓ하기
    m -= 1

print(count)


