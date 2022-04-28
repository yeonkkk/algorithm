d=[] 
for i in range(19) :
    d.append(list((map(int, input().split())))) # 리스트 d에 입력된 리스트들을 넣는다.

n = int(input()) # 좌표 입력 횟수

for i in range(n) :
    x,y=map(int, input().split()) # n번 만큼 좌표 입력 받기

    for j in range(19) :
        if d[j][y-1]==0 :
            d[j][y-1]=1
        else :
            d[j][y-1]=0

        if d[x-1][j]==0 :
            d[x-1][j]=1
        else :
            d[x-1][j]=0

for i in range(19) :
    for j in range(19) : 
        print(d[i][j], end=' ') 
    print()       