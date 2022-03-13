#19. Remove Nth Node From End of List
#

# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val = 0, _next = nil)
#         @val = val
#         @next = _next
#     end
# end
# @param {ListNode} head
# @param {Integer} n
# @return {ListNode}
require '../data_structures/ListNode'

def remove_nth_from_end(head, n)
  arr = Array.new(31)
  size = 0
  idx = 1
  until head.nil?
    arr[idx] = head
    head = head.next
    size += 1
    idx += 1
  end
  target_idx = size - n + 1
  if target_idx == 1
    return arr[target_idx].next
  else
    bef_target = arr[target_idx - 1]
    bef_target.next = arr[target_idx].next
    return arr[1]
  end
end

head = ListNode.create_head_by_depth(5)
# puts head.print_nodes.to_s
puts remove_nth_from_end(head, 5).print_nodes.to_s