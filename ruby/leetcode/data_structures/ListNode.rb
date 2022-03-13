class ListNode
  attr_accessor :val, :next

  def self.create_head_by_depth(depth)
    idx = 1
    head = ListNode.new(idx)
    node = head
    while idx < depth
      node.next = ListNode.new(idx + 1)
      node = node.next
      idx += 1
    end

    head
  end

  def print_nodes
    res = []
    node = self
    until node.nil?
      res.push(node.val)
      node = node.next
    end
    res
  end

  def initialize(val = 0, _next = nil)
    @val = val
    @next = _next
  end
end
