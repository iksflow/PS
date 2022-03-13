# def has_dup(s)
#   arr = []
#   s.each_char do |c|
#     if arr[c.ord].nil?
#       arr[c.ord] = 1
#     else
#       return true
#     end
#   end
#
#   false
# end
# def length_of_longest_substring(s)
#   return s.length if s.length < 2
#   max_size = 1
#   left = 0
#   right = 0;
#   s.length.times do |i|
#     # break if right >= s.length - 1
#     while !has_dup(s[left..right])
#       break if right > s.length - 1
#       right += 1
#     end
#     max_size = [max_size, right - left].max
#     break if right == s.length - 1
#     left += 1
#     right += 1
#   end
#   max_size
# end

# ver. 2
# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
  return s.size if s.size <= 1
  left = 0
  right = 0
  max = 0
  while right < s.size
    window = s[left..right]
    if right >= s.size - 1
      max = [window.size, max].max
      break;
    elsif window.include?(s[right + 1])
      left += 1
    else
      right += 1
    end
    max = [window.size, max].max
  end
  max
end

# s = "abcabcbb"

# s = "dvdf"
s = "pwwkew"
puts length_of_longest_substring(s)
# arr = [1, 2, 3]
#
# arr.length.times do |i|
#   puts i until i > 2
# end
