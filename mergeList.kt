/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var current = dummyHead
        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null) {
            if (l1.`val` <= l2.`val`) {
                current.next = l1
                l1 = l1.next
            } else {
                current.next =l2q
                l2 = l2.next
            }
            current = current.next!!
        }

        if (l1 != null) {
            current.next = l1
        } else {
            current.next = l2
        }

        return dummyHead.next
    }
}

fun main() {
    // Tạo danh sách liên kết cho list1: 1 -> 2 -> 4
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next!!.next = ListNode(4)

    // Tạo danh sách liên kết cho list2: 1 -> 3 -> 4
    val list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next!!.next = ListNode(4)

    val solution = Solution()
    val result = solution.mergeTwoLists(list1, list2)

    // In kết quả: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    var current = result
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    println("null")
}