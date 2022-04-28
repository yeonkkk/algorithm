n = int(input())
d = [0] *1001
d[1] = 1 # n이 1이면 경우의 수는 1개
d[2] = 3 # n이 2이면 경우의 수는 3개

for i in range(3, n+1):
    d[i] = (d[i-1] + 2 * d[i-2]) % 796796

print(d[n])