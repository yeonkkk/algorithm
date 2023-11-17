import sys
input = sys.stdin.readline

# 입력
n, g, k = map(int, input().split())

needed = []
not_needed = []
for _ in range(n):
    s, l, o = map(int, input().split())
    needed.append((s, l)) if o == 0 else not_needed.append((s, l))

# 각 재료의 세균 수 계산
def calculate_germ(current_day, elements):
    germs = [max(1, current_day - l) * s for s, l in elements]
    return sorted(germs, reverse=True)

days = 0
left, right = 0, int(2e9)

while left <= right:
    mid = (left + right) // 2
    total_germ = sum(calculate_germ(mid, needed)) + sum(calculate_germ(mid, not_needed)[k:])
    
    if total_germ <= g:
        days = max(mid, days)
        left = mid + 1
    else:
        right = mid - 1

print(days)