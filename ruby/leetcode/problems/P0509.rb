# 509. Fibonacci Number
#
# @param {Integer} n
# @return {Integer}
def fib(n)
  memo = [31]
  memo[0] = 0
  memo[1] = 1
  n.times do |idx|
    if memo[idx].nil?
      memo[idx] = memo[idx - 1] + memo[idx - 2]
    end
  end
  memo[n]
end


5.times do |n|
  puts "hi #{n}"
end
