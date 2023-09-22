import sys
input = sys.stdin.readline

start, end, stm = input().split()

init_time = 0
start = int(start[:2] + start[3:])
end = int(end[:2] + end[3:])
stm = int(stm[:2] + stm[3:])

pre = set()
post = set()
while True:
    try:
        time, name = input().split()
        time = int(time[:2] + time[3:])
        
        if init_time <= time <= start: pre.add(name)
        elif end <= time <=stm: post.add(name)
    except:
        break

print(len(pre & post))