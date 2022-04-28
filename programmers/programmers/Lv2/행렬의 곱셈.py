def solution(arr1, arr2):
    import numpy as np
    arr3, arr4 = np.array(arr1), np.array(arr2)
    result = arr3 @ arr4
    return result.tolist()
