# 283. Move Zeroes

# @param {Integer[]} nums
# @return {Void} Do not return anything, modify nums in-place instead.
def move_zeroes(nums)
  return if nums.size == 1
  zero_idx = 0
  non_zero_idx = 0

  while non_zero_idx < nums.size && zero_idx < nums.size
    zero_idx += 1 while !nums[zero_idx].zero? && zero_idx < nums.size - 1
    non_zero_idx += 1 while nums[non_zero_idx].zero? && non_zero_idx < nums.size - 1

    break if zero_idx >= nums.size || non_zero_idx >= nums.size
    if zero_idx < non_zero_idx
      nums[zero_idx] = nums[non_zero_idx]
      nums[non_zero_idx] = 0
      zero_idx += 1
      non_zero_idx += 1
    else
      non_zero_idx += 1
    end
  end
end

# nums = [0,1,0,3,12]
# nums = [0, 0]
nums = [1,  0]
move_zeroes(nums)
puts nums