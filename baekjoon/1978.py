
n = int(input())
input_num = map(int, input().split())

def check_prime(num):
    if num == 1:
        return False

    for i in range(2, num):
        if num % i == 0:
            return False
    return True


print(sum([check_prime(x) for x in input_num]))
        
 

'''
n = int(input())
input_num = map(int, input().split())

nprime_num = [1]
output_num = []

for i in range(1, 1000+1):
    j = 2
    while 1 < j < i:
        if i % j == 0:
            nprime_num.append(i)
            j += 1

        else:
            j += 1

for i in input_num:
    if i in nprime_num:
        continue
    else:
        output_num.append(i)


for i in range(1, 1000+1):
    if i in nprime_num:
        continue
    else:
        if i in input_num:
            output_num.append(i)


print(output_num) 

'''