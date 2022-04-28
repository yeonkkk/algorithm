n = int(input(), 16)
 
for i in range (1, 15+1):
  print('%X'%n, '*%X'%i, '=%X'%(n*i), sep='')