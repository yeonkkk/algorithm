def solution(n):
    return int(''.join(sorted(str(int(n)), reverse = True)))
