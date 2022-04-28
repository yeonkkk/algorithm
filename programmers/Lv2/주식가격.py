def solution(prices):
    answer, stack = [0] * len(prices), []
    for i, p in enumerate(prices):
        while stack and p < prices[stack[-1]]:
            j = stack.pop()
            answer[j] = i - j
        stack.append(i)
        
    while stack:
        k = stack.pop()
        answer[k] = len(prices) - (1+k)
    return answer
