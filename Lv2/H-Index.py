def solution(citations):
    answer = 0
    citations.sort()
    for i in range(max(citations)+1):
        count = 0
        for c in citations:
            if i <= c: count += 1
        if count >= i and len(citations)-count <= i: answer = max(answer, i)
    return answer
