from collections import defaultdict
nums = defaultdict(int)

for i in range(1, 10):
    nums[int(input())] = i

print(max(nums.keys()), nums[max(nums.keys())])
 
    