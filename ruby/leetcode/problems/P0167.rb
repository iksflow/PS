# Two Sum II - Input Array Is Sorted

# @param {Integer[]} numbers
# @param {Integer} target
# @return {Integer[]}
def two_sum(numbers, target)
  p1 = 0
  p2 = numbers.size - 1
  while p1 < p2
    sum = numbers[p1] + numbers[p2]
    break if sum == target
    if sum > target
      p2 -= 1
    else
      p1 += 1
    end
  end
  [p1 + 1, p2 + 1]
end

# numbers = [2,7,11,15]
# target = 9
numbers = [5, 25, 75]
target = 100

puts two_sum(numbers, target)