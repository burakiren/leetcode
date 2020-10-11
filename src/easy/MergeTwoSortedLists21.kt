package easy

import org.w3c.dom.NodeList


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class MergeTwoSortedLists21 {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val rList: ListNode? = ListNode(-1)
        var curr = rList
        var list1 = l1
        var list2 = l2
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                curr?.next = list2
                break
            }
            if (list2 == null) {
                curr?.next = list1
                break
            }
            if (list1.value <= list2.value) {
                curr?.next = list1
                list1 = list1.next
            } else {
                curr?.next = list2
                list2 = list2.next
            }
            curr = curr?.next
        }
        return rList?.next
    }

}