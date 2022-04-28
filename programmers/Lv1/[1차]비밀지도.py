def solution(n, arr1, arr2):
    result = []
    for i in range(n):
        k = str(int(bin(arr1[i])[2:]) + int(bin(arr2[i])[2:]))
        if len(k) < n:
            k = '0'*(n - len(k)) + k
        a = ''
        for j in k:
            if j == '0': a += ' ' 
            else: a += '#' 
        result.append(a)
    return result
