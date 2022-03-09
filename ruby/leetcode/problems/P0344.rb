# 344. Reverse String

# @param {Character[]} s
# @return {Void} Do not return anything, modify s in-place instead.
def reverse_string(s)
  # s.reverse
  left = 0
  right = s.size - 1
  while left < right
    temp = ''
    temp = s[left]
    s[left] = s[right]
    s[right] = temp
    left += 1
    right -= 1
  end
  s
end
s = ["h","e","l","l","o"]
puts reverse_string(s)