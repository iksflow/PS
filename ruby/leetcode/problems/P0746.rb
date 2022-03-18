# 746. Min Cost Climbing Stairs
#
# @param {Integer[]} cost
# @return {Integer}
def min_cost_climbing_stairs(cost)
  memo = [1001]
  memo[0] = cost[0]
  memo[1] = cost[1]

  # dp(layer)
  # dp(0) = cost[0] = 1
  # dp(1) = cost[1] = 100
  # dp(2) = min(dp(0), dp(1)) + cost[2] = 1
  # dp(3) = min(dp(1), dp(2)) + cost[3] =
  # dp(4) = min(dp(2), dp(3))
  (2..cost.size - 1).each do |n|
    memo[n] = [memo[n - 2], memo[n - 1]].min + cost[n]
  end
  [memo[-1], memo[-2]].min
end

cost = [1,100,1,1,1,100,1,1,100,1]
# cost = [10, 15, 20]
puts min_cost_climbing_stairs(cost)