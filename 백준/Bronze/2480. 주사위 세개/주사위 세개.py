from collections import Counter 

random = list(map(int, input().split()))

num, fre = Counter(random).most_common(1)[0]

if fre == 3:
    print(10000+num*1000)
elif fre == 2:
    print(1000+num*100)
else:
    print(max(random)*100)

    