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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p = l1
        var q = l2
        var carry = 0
        val dummyHead = ListNode(0)
        var current = dummyHead

        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = carry + x + y
            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!!

            if (p != null) p = p.next
            if (q != null) q = q.next
        }

        if (carry > 0) {
            current.next = ListNode(carry)
        }

        return dummyHead.next
    }
}

fun main() {
    // Tạo danh sách liên kết cho số 342 (3 -> 4 -> 2)
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next!!.next = ListNode(3)

    // Tạo danh sách liên kết cho số 465 (4 -> 6 -> 5)
    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next!!.next = ListNode(4)

    val solution = Solution()
    val result = solution.addTwoNumbers(l1, l2)

    // In kết quả (7 -> 0 -> 8)
    var current = result
    while (current != null) {
        print("${current.`val`} ")
        current = current.next
    }
}