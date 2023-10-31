def execute(k, n):
    result = [ i for i in range(1, n + 1)]
    for _ in range(k):
        for i in range(1, n):
            result[i] += result[i-1]
    
    return result[-1]

t = int(input())

for _ in range(t):
    k = int(input())
    n = int(input())

    print(execute(k, n))