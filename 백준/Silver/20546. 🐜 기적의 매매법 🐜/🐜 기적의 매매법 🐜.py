import sys

input = sys.stdin.readline

n = int(input())
prices = list(map(int, input().split()))

# 준현이
jun_cash = n
jun_count = 0
for price in prices:
    count = jun_cash // price
    if count > 0:
        jun_count += count
        jun_cash -= price * count

# 성민이
seong_cash = n
seong_count = 0
status = 0

for i in range(1,len(prices)):
    if (prices[i-1] < prices[i]):
        if 0 < status:
            status += 1
        else:
            status = 1
    else:
        if status < 0:
            status -= 1
        else:
            status = -1
    
    if status == 3:
        seong_cash += seong_count * prices[i]
        seong_count = 0
        status = 0

    elif status == -3:
        count = seong_cash//prices[i]
        seong_count += count
        seong_cash -= prices[i] * count
        status = 0

jun_fin = jun_cash + prices[-1] * jun_count
seong_fin = seong_cash + prices[-1] * seong_count

if jun_fin < seong_fin:
    print("TIMING")
elif seong_fin < jun_fin:
    print("BNP")
else:
    print("SAMESAME")