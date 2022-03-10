# 557. Reverse Words in a String III

# @param {String} s
# @return {String}
def reverse_words(s)
  len = s.size
  return s if len == 1
  left = 0
  right = 0
  res = ''
  while left < len
    right += 1
    if (s[right].eql?' ') || (right == len)
      idx = right - 1
      while left <= idx
        res += s[idx]
        idx -= 1
      end
      res += ' ' if right != len
      left = right + 1
    end
  end
  res
end

s = 'abc def'
puts reverse_words(s)