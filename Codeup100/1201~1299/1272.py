k, h = map(int, input().split())

def donation(i):
    if i % 2 == 0:
        return i*5
    else:
        return int((i+1)/2)

print(donation(k)+donation(h))