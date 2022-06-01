num = input()
count = 0

# num의 길이가 1보다 크면 변환 진행
while len(num) > 1:
    num = str(sum(map(int, list(num))))
    count += 1

print(count)
if int(num) % 3 != 0: print("NO")
else: print("YES")