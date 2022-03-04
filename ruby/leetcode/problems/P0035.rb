# 35. Search Insert Position

# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search_insert(nums, target)
  left = 0
  right = nums.size - 1
  while left <= right
    mid = (left + right) / 2
    if nums[mid] == target
      return mid
    elsif nums[mid] < target
      left = mid + 1
    else
      right = mid - 1
    end
  end

  left
end

# n = [1, 3, 5, 6]
# t = 5
n = [1, 3, 5, 6]
t = 2

puts search_insert(n, t)