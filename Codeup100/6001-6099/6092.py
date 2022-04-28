n = int(input())
a = list(map(int, input().split()))

d = []
for i in range(24): 
  d.append(0) 

for i in range(n):    #번호를 부를 때마다, 그 번호에 대한 카운트 1씩 증가
  d[a[i]] += 1

for i in range(1, 24): 
  print(d[i], end=' ')