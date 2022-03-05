# 977. Squares of a Sorted Array
# @param {Integer[]} nums
# @return {Integer[]}
def sorted_squares(nums)
  # nums.each_with_index do |n, index|
  #   nums[index] = n ** 2
  # end
  # nums.sort!
  # result = []
  # nums.each
  result = []
  idx = 0
  nums.each do |n|
    result[idx] = n ** 2
    idx += 1
  end
  result.sort!
end

nums = [-4, -1, 0, 3, 10]
puts sorted_squares(nums)
