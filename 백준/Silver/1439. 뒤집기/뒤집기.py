import sys

input = sys.stdin.readline

s = input()

count = [0, 0]

if len(s) < 2:
    print(0)
else:
    for i in range(1, len(s)):
        pre = s[i - 1]
        curr = s[i]
        if pre != curr:
            count[int(pre)] += 1
            continue
        
        if i == (len(s) - 1):
            count[int(curr)] += 1

    print(min(count))
