# 부품이 있는지 확인하는 함수
def search_materials(array, target, start, end):
    while start <= end:
        mid = (start+end) // 2
        if array[mid] == target:
            return mid
        elif array[mid] < target:
            start = mid + 1        
        else:
            end = mid - 1
    return None

# 입력 받기
n = int(input())
array = list(map(int, input().split()))
m = int(input())
target_list = list(map(int, input().split()))

for target in target_list:
    result = search_materials(array, target, 0, n-1)
    if result == None:
        print("No", end = " ")
    else:
        print("yes", end=" ")