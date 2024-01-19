import sys

input = sys.stdin.readline

input_str = input()

count = 0
result = ''

for c in input_str:
    if c == 'X':
        count += 1
        continue
    else:
        if count % 2 != 0:
            result = -1
            break
        
        if count == 0:
            result += c
            continue

        result += "AAAA" * (count // 4) + "BB" * ((count % 4) // 2)
        result += c
        count = 0

if count % 2 != 0:
    print(-1)
else:      
    print(result)