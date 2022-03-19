# 198. House Robber
#
#
# @param {Integer[]} nums
# @return {Integer}
def rob(nums)
  # dp(0) = nums[0]
  # dp(1) = max(nums[0], nums[1])
  # dp(2) = max(dp(1), dp(0) + nums[2])
  # dp(3) = max(dp(2), dp(1) + nums[3])
  return nums[0] if nums.size < 2
  memo = [101]
  memo[0] = nums[0]
  memo[1] = [nums[0], nums[1]].max
  (2..nums.size - 1).each do |n|
    memo[n] = [memo[n - 1], memo[n - 2] + nums[n]].max
  end
  [memo[-1], memo[-2]].max
end

# nums = [1,2,3,1]
nums = [2,7,9,3,1]
puts rob(nums)