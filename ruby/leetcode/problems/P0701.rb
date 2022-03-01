# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search(nums, target)
  result = -1
  idx = nums.size / 2
  bef_idx = 0
  while idx != bef_idx
    bef_idx = idx
    if nums[idx] < target
      idx = (nums.size + idx + 1) / 2
    elsif nums[idx] > target
      idx /= 2
    else
      result = idx
      break
    end
  end

  result
end

# nums = [-1, 0, 3, 5, 9, 12]
# target = 9

nums = [-1, 0, 3, 5, 9, 12]
target = 2

puts search(nums, target)
