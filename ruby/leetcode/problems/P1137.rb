# 1137. N-th Tribonacci Number

# @param {Integer} n
# @return {Integer}
def tribonacci(n)
  memo = [0, 1, 1]
  return memo[n] if n < 3
  for idx in 3..n
    memo[idx] = memo[idx - 1] + memo[idx - 2] + memo[idx - 3]
  end

  memo[n]
end

puts tribonacci(25)