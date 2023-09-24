sentence = input()
word = input()

corr_word = ""
for s in sentence:
    if not s.isdigit(): corr_word += s

print(1) if word in corr_word else print(0)