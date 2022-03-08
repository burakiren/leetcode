package removeDuplicatesFromStortedList

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class RemoveDuplicatesFromStortedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return head

        var curr = head

        while(curr?.next != null){
            if(curr.`val` == curr.next?.`val`) curr.next = curr.next?.next
            else curr = curr.next
        }
        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}