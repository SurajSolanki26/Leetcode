# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        ptr = head
        seen = set()
        while ptr:
            if ptr not in seen:
                seen.add(ptr)
            else:
                return True
            ptr = ptr.next
        return False