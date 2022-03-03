# 278. First Bad Version
def is_bad_version(version)
  bad = 1
  bad <= version
end

def first_bad_version(n)
  left = 0
  right = n
  mid = -1
  while left <= right
    mid = (left + right) / 2
    res = is_bad_version(mid)
    if !is_bad_version(mid - 1) && res
      break
    end
    if res
      right = mid - 1
    else
      left = mid + 1
    end
  end

  mid
end

puts first_bad_version(1)