def cantorian_set_maker(start_index, end_index):
    global arr
    if start_index == end_index: return

    gap = (end_index - start_index + 1) // 3

    cantorian_set_maker(start_index, start_index + gap -1)
    cantorian_set_maker(end_index - gap + 1, end_index)
    
    for i in range(start_index + gap, end_index - gap + 1):
        arr[i] = " "

while True:
    try:
        n = int(input())
        arr = ["-"] * (3 ** n)
        cantorian_set_maker(0, len(arr) - 1)
        print("".join(arr))
    except:
        break