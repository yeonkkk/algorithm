def solution(s):
    sl= list(map(int, s.split()))
    return f'{min(sl)} {max(sl)}'
