n, m = map(int, input().split())
card_list = []
for i in range(n):
    card_list.append(list(map(int, input().split())))

for i in range(n):
    card_list[i].sort()

for i in range(n):
    if i+1 < n:
        if card_list[i][0] <= card_list[i+1][0]:
            result = card_list[i+1][0]
        else:
            result = card_list[i][0]
    else:
        break

print(result)
