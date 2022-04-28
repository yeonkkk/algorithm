# 실패 코드
def solution(s):
    if s.count('(') != s.count(')'): return False
    elif s[0] ==')' or s[-1] == '(': return False
    else: return True
    
  # stack 활용 코드
  def solution(s):
    stack = []
    for i in s:
        if i == '(': stack.append(i)
        elif stack == []: return False
        else: stack.pop()        
    return stack == []
