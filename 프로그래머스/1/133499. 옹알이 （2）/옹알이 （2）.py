def replace_word(word):
    babbling_pw = ["aya", "ye", "woo", "ma"]
    n = len(word)
    for pw in babbling_pw:
        if word.find(pw) == -1 or word.find(pw * 2) > -1: continue
        word = word.replace(pw, "0")
    
    return len(word.replace("0", "")) == 0

def solution(babbling):
    count = 0
    for word in babbling:
        if replace_word(word): 
            count += 1
    return count