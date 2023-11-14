def solution(N, stages):
    counts = [0] * (N + 2)
    rates = []
    
    for stage in stages: counts[stage] += 1
    
    for stage, count in enumerate(counts):
        if stage == 0 or stage == N + 1: continue
        total = sum(counts[stage : ])
        
        if total == 0:
            rates.append((stage, 0))
            continue
            
        rates.append((stage, count/total))        
    rates.sort(key=lambda x:(-x[1], x[0]))
    
    return [pair[0] for pair in rates]