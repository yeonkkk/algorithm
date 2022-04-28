def solution(arr, divisor):
    answer = []
    for element in arr:
        if element % divisor == 0: answer.append(element)
    return [-1] if answer == [] else sorted(answer)
