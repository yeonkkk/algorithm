from collections import Counter

num = 1
for _ in range(3):
    num *= int(input())

count = Counter(str(num))
for i in range(10):
    if str(i) in count: print(count[str(i)])
    else: print(0)
