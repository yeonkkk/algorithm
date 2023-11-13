def convert_bin(num, n):
    num = bin(num)[2:]
    size = len(num)
    if size < n: num = '0' * (n - size) + num
    return num
    
def combine_line(line1, line2):
    result = ''
    for a, b in zip(line1, line2):
        if a == '1' or b == '1':
            result += '#'
            continue
        result += ' '
    return result

def solution(n, arr1, arr2):
    result = []
    for i in range(n):
        line1 = convert_bin(arr1[i], n)
        line2 = convert_bin(arr2[i], n)
        result.append(combine_line(line1, line2))
    return result