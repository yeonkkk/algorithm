import sys
from collections import defaultdict

input = sys.stdin.readline

n = int(input())
result = 0

for _ in range(n):
    count = defaultdict(int)
    word = input()
    pre = word[0]
    flag = True
    
    for char in word:
        if (pre != char) and (count[char] > 0): 
            flag = False
            break
        count[char] += 1
        pre = char
    if flag: result += 1

print(result)