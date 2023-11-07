import sys
input = sys.stdin.readline

start, end, stm = input().split()

init_time = 0
start = int(start.replace(':', ''))
end = int(end.replace(':', ''))
stm = int(stm.replace(':', ''))

pre = set()
post = set()
while True:
    try:
        time, name = input().split()
        time = int(time.replace(':', ''))
        
        if init_time <= time <= start: pre.add(name)
        elif end <= time <= stm: post.add(name)
    except:
        break

print(len(pre & post))