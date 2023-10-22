n = int(input())
sentence = input()
result = "NO"

for i in range(n):
    left_word = sentence[:i]
    right_word = sentence[n-i:]

    count = 0
    for j in range(i):
        if left_word[j] != right_word[j]: 
            count += 1
    
    if count == 1: 
        result = "YES"
        break

print(result)