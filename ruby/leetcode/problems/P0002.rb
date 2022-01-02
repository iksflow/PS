# 2. Add Two Numbers
require '../data_structures/ListNode'

def traverse(ln, arr)
  if ln.nil?

  else
    arr.push(ln.val)
    traverse(ln.next, arr)
  end
end

def add_two_numbers(l1, l2)
  arr1 = []
  arr2 = []
  res = []
  traverse(l1, arr1)
  traverse(l2, arr2)
  len = [arr1.length, arr2.length].max
  len.times do |n|
    sum = res[n].to_i + arr1[n].to_i + arr2[n].to_i
    rest = sum % 10
    quot = sum / 10
    res[n] = rest
    if quot > 0
      res[n + 1] = sum / 10
    end
  end
  res
end

ln1 = ListNode.new(3)
ln2 = ListNode.new(4, ln1)
ln3 = ListNode.new(2, ln2)
ln4 = ListNode.new(4)
ln5 = ListNode.new(6, ln4)
ln6 = ListNode.new(5, ln5)

puts add_two_numbers(ln3, ln6)
