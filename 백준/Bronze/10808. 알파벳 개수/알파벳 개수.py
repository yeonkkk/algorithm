import sys

input = sys.stdin.readline

s = list(input().strip())
alphabet_count = [0 for _ in range(ord('a'), ord('z') + 1)]

for c in s:
    alphabet_count[ord(c) - 97] += 1

result = ' '.join(map(str, alphabet_count))
print(result)
