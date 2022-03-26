# 53. Maximum Subarray

# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
  # dp(n) = 연속된 n개의 원소를 가진 부분집합의 가장 큰 합
  # dp(0) = 0
  # dp(1) = max(arr)
  # dp(2) =
end

# Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
# Output: 6
# Explanation: [4,-1,2,1] has the largest sum = 6.
# nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
nums = [-2, 1, -3, 4, -9, 2, 1, -2, 4]
puts max_sub_array(nums)
