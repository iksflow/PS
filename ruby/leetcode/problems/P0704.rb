# # @param {Integer[]} nums
# # @param {Integer} target
# # @return {Integer}
# def search(nums, target)
#   result = -1
#   first_idx = 0
#   last_idx = nums.size - 1
#   while first_idx <= last_idx
#     idx = (first_idx + last_idx) / 2
#
#     if nums[idx] == target
#       return idx
#     elsif nums[idx] < target
#       first_idx = idx + 1
#     else
#       last_idx = idx - 1
#     end
#   end
# end
#
# second try
#
# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search(nums, target)
  left = 0
  right = nums.size - 1
  while left <= right
    idx = (left + right) / 2
    if nums[idx] == target
      return idx
    elsif nums[idx] < target
      left = idx + 1
    else
      right = idx - 1
    end
  end
  -1
end
nums = [-1, 0, 3, 5, 9, 12]
target = 8

# nums = [-1, 0, 3, 5, 9, 12]
# target = 2

# nums = [2, 5]
# target = 5

puts search(nums, target)
