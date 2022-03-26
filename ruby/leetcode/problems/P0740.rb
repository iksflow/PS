require 'set'
# 740. Delete and Earn
# @param {Integer[]} nums
# @return {Integer}
def delete_and_earn(nums)
  # sum[arr] = memo sum of each number
  # fn.maxPoint(n) = return highest point when choose number in 1 to n.
  # dp(0) = 0
  # dp(1) = maxPoint(1)
  # dp(2) = max(maxPoint(2) + maxPoint(0), maxPoint(1))
  # dp(3) = max(maxPoint(3) + maxPoint(1), maxPoint(2))
  # dp(n) = max(maxPoint(n) + maxPoint(n-2), maxPoint(n-1))
  point = {}
  max_num = 0
  nums.each do |n|
    max_num = [max_num, n].max
    if point.key?(n)
      point[n] += n
    else
      point[n] = n
    end
  end
  memo = Array.new(max_num + 1)
  memo[0] = 0
  memo[1] = point[1] || 0

  (2..max_num).each do |n|
    memo[n] = [(point[n] || 0) + memo[n - 2], memo[n - 1]].max
  end

  memo[max_num]
end

# nums = [2,2,3,3,3,4]
nums = [3, 4, 2]
puts delete_and_earn(nums)
# puts nil || 0