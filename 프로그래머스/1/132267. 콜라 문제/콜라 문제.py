def solution(a, b, n):
    cokes = 0
    bottles = n
    
    while a <= bottles:
        possible_bottles = bottles // a
        new_cokes = possible_bottles * b
        
        cokes = cokes + new_cokes
        bottles = bottles - possible_bottles * a + new_cokes
    
    return cokes