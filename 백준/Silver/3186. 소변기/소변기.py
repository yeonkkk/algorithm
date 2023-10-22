k, l, n = map(int, input().split())

status = input()

result = ""
flag = False
k_count = 0
l_count = 0

for i in range(n):
    if status[i] == "1": 
        k_count += 1
        l_count = 0
    else: 
        l_count += 1
        k_count = 0

    if k_count == k:
        flag = True
        continue

    if (flag == True) and (l_count == l):
        flag = False
        result += str(i + 1) + "\n"

if flag == True: result += str(l + n)
result = "NIKAD" if len(result) == 0 else result
print(result)