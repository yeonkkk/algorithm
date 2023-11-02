def execute(n, house):
    time = check_time(n, houses)
    return -1 if time > 1440 else time

def check_time(n, houses):
    if n == 1: return houses[0]

    time = 0
    while True:
        houses.sort(reverse=True)

        if houses[0] == 0:
            return time

        if houses[1] == 0 and houses[0] > 0:
            houses[0] -= 1
            time += 1
            continue
        
        houses[0] -= 1
        houses[1] -= 1
        time += 1
   

n = int(input())
houses = list(map(int, input().split()))

print(execute(n, houses))
