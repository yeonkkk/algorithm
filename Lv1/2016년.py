def solution(a, b):
    w = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    m = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    d = (sum(m[:a-1]) + b - 1)%7
    return w[d]
