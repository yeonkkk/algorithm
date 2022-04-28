def solution(s):
    sn = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i, n in enumerate(sn):
        s = s.replace(n, str(i))
    return int(s)
