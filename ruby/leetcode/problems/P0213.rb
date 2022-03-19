# 213. House Robber II

# @param {Integer[]} nums
# @return {Integer}
def rob(nums)

  # dp(0) = nums[0]
  # dp(1) = max(nums[0], nums[1])
  # dp(2) = max(nums[0], nums[1], nums[2])
  # dp(3) = max(dp(0) + dp(2), dp(1) + nums[3])
  # dp(4) = max(dp(3), dp(2) + nums(4))
  return nums[0] if nums.size < 2
  return [nums[0], nums[1]].max if nums.size < 3
  return [nums[0], nums[1], nums[2]].max if nums.size < 4
  memo = [101]
  memo[0] = nums[0]
  memo[1] = [nums[0], nums[1]].max

  (2..nums.size - 1).each do |n|
    memo[n] = [memo[n - 1],  memo[n - 2] + nums[n]].max
  end
  memo[-2]
end

# nums = [2,3,2]
# nums = [1,2,3,1]
# nums = [1,2,3]
nums = [1,2,1,1]
puts rob(nums)