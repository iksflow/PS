# 189. Rotate Array

# @param {Integer[]} nums
# @param {Integer} k
# @return {Void} Do not return anything, modify nums in-place instead.
def rotate(nums, k)
  return if k.zero?
  len = nums.size
  split_point = len - (k % len)
  temp = nums[split_point..len - 1]
  nums[k..len - 1] = nums[0..split_point - 1]
  nums[0..k - 1] = temp
end

# nums = [1,2,3,4,5,6,7]
# k = 3
nums = [-1, -100, 3, 99]
k = 4
rotate(nums, k)
puts nums