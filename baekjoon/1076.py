col_1 = input()
col_2 = input()
col_3 = input()

color_list = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"]

def resistance(x, y, z):
    i1 = color_list.index(x)
    i2 = color_list.index(y)
    i3 = color_list.index(z)
    rst = int(str(i1)+str(i2)) * (10**i3)
    return rst

print(resistance(col_1, col_2, col_3))

