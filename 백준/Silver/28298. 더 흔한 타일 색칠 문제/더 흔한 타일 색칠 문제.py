import sys
from collections import defaultdict
input = sys.stdin.readline

n, m, k = map(int, input().split())
lines = [''] * k

for i in range(n):
    idx = i % k
    lines[idx] += input().strip()

def get_max_entry(count_dict):
    max_value = -1
    max_key = ''
    
    for k, v in count_dict.items():
        if max_value < v:
            max_value = v
            max_key = k
    
    return(max_key, max_value)

count = 0
for line_idx, line in enumerate(lines):
    line = list(line)
    for i in range(k):
        idxs = []
        check = defaultdict(int)
        sub_count = 0
        for j in range(i, len(line), k):
            check[line[j]] += 1
            sub_count += 1
            idxs.append(j)

        key, value = get_max_entry(check)
        count += sub_count - value
        for idx in idxs: line[idx] = key
    lines[line_idx] = ''.join(line)
    
print(count)

for i in range(0, len(lines[0]), m):
    for line in lines:
        print(line[i:i+m])