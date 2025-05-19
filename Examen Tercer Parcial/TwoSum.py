def two_sum_hash(nums, target):
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[num] = i

def two_sum_brute_force(nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]

print(two_sum_hash([2, 7, 11, 15], 9))     # Output: [0, 1]
print(two_sum_brute_force([3, 2, 4], 6))   # Output: [1, 2]
print(two_sum_hash([3, 3], 6))             # Output: [0, 1]

def two_product_brute_force(nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] * nums[j] == target:
                return [i, j]

def two_product_hash(nums, target):
    if target == 0:
        seen = {}
        for i, num in enumerate(nums):
            if num == 0:
                if 0 in seen:
                    return [seen[0], i]
                seen[0] = i
        return None

    seen = {}
    for i, num in enumerate(nums):
        if num != 0 and target % num == 0:
            complement = target // num
            if complement in seen:
                return [seen[complement], i]
        seen[num] = i

print(two_product_brute_force([2, 7, 11, 15], 14))   # Output: [0, 1]
print(two_product_hash([3, 2, 4], 8))                # Output: [1, 2]
print(two_product_brute_force([3, 3], 9))            # Output: [0, 1]
