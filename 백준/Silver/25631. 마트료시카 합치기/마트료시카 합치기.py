n = int(input())
dolls = list(input().split())
dolls.sort()
count = 0

for i in range(n):
    current_doll = dolls[i]

    if current_doll == "0":
        continue
        
    count += 1
    for j in range(i + 1, n):
        com_doll = dolls[j]

        if current_doll < com_doll: 
            current_doll = com_doll
            dolls[j] = "0"

print(count)