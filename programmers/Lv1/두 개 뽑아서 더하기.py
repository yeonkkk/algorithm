def solution(numbers):
    answer = []
    for idx, number in enumerate(numbers):
        for j in range(idx+1, len(numbers)):
            answer.append(number + numbers[j])
    result = list(set(answer))
    result.sort()
    return result
