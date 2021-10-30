n, k = map(int, input().split())
max_list = list(map(int, input().split()))
min_list = list(map(int, input().split()))

max_list.sort()
min_list.sort(reverse=True)

for i in range(k):
    if max_list[i] < min_list[i]:
        max_list[i], min_list[i] = min_list[i], max_list[i]
    else:
        break

print(sum(max_list))