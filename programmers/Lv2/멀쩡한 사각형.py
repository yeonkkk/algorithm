def solution(w,h):
    a, b = max(w, h), min(w, h)
    while True:
        m = a % b
        if m == 0: break
        a, b = b, m
    return w * h - (w + h - b)
