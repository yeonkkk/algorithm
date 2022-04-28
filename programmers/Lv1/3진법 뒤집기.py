def solution(n):
    result = ''
    while n > 0:
        n, mod = divmod(n, 3)
        result += str(mod)
    return int(result, 3)
