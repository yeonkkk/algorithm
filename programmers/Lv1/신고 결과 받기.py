def solution(id_list, report, k):
    from collections import Counter
    result = [0] * len(id_list)
    u = []
    check = {}
    for r in set(report):
        x, y = r.split()
        u.append(y)
        if y not in check.keys():
            check[y] = [x]
        else:
            check[y].append(x)
            
    
    for key, value in Counter(u).items():
        if value >= k:
            for i in check[key]:
                result[id_list.index(i)] += 1
    return result
