# 876. Middle of the Linked List

# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
# @param {ListNode} head
# @return {ListNode}
def middle_node(head)
  arr = Array.new(101)
  depth = 0
  node = head
  while !node.nil?
    depth += 1
    arr[depth] = node
    node = node.next
  end
  middle = depth / 2 + 1
  arr[middle]
end

arr = Array.new(101)
# puts arr.size
# puts middle_node()