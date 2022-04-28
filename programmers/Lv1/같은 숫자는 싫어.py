def solution(arr):
    answer = []
    for val in arr:
        if answer == [] or val != answer[-1]: answer.append(val)
    return answer
