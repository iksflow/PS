# @param {Integer} n
# @return {Integer}
def climb_stairs(n)
  # dp(0) = 0
  # dp(1) = 1
  # dp(2) = 2
  # dp(3) = dp(1) + 2 # 111, 12, 21 = dp(2) + 1 = dp(2) + dp(1)
  # dp(4) = dp(2) + 2 # 1111, 112, 211, 121, 22 =  dp(3) +dp(2)
  memo = [46]
  memo[0] = 0
  memo[1] = 1
  memo[2] = 2
  (3..n).each { |i|
    memo[i] = memo[i - 1] + memo[i - 2]
  }
  memo[n]
end

n = 4
puts climb_stairs(n)