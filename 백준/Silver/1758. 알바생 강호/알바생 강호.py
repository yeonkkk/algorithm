import sys

input = sys.stdin.readline

n = int(input())
tips = []

for _ in range(n):
    tips.append(int(input()))

tips.sort(reverse=True)

result = 0
for i, tip in enumerate(tips):
    total = tip - i
    
    if total < 0:
        continue

    result += total

print(result)