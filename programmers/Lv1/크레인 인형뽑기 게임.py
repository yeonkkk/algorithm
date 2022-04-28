def solution(board, moves):
    answer = 0
    check = [0]
    for i in moves:
        for b in board:
            if b[i-1] is not 0:
                if check[-1] == b[i-1]:
                    check.pop()
                    answer += 2
                    b[i-1] = 0
                    break
                else:
                    check.append(b[i-1])
                    b[i-1] = 0
                    break
    
    return answer
