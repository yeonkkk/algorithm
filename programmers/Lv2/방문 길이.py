def solution(dirs):
    d = ['U', 'D', 'R', 'L']
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    
    r = []
    count = 0
    x, y = 0, 0
    for dir in dirs:
        i = d.index(dir)
        if x + dx[i] > 5 or x + dx[i] < -5 or y + dy[i] > 5 or y + dy[i] < -5: continue
        px, py = x, y
        x = x + dx[i]
        y = y + dy[i]
        if [(px, py), (x, y)] in r or [(x, y), (px, py)] in r: 
                continue
        else:
            r.append([(px, py), (x, y)])
            count += 1
    return count
    
