fun TreeConstructor(strArr: Array<String>): String {
    val parentCount = mutableMapOf<Int, Int>()
    val childCount = mutableMapOf<Int, Int>()

    for (pair in strArr) {
        val (child, parent) = pair.removeSurrounding("(", ")").split(",").map { it.toInt() }

        // Đếm số lần mỗi nút xuất hiện như là cha
        parentCount[parent] = parentCount.getOrDefault(parent, 0) + 1
        if (parentCount[parent]!! > 2) {
            return "false"
        }

        // Đếm số lần mỗi nút xuất hiện như là con
        childCount[child] = childCount.getOrDefault(child, 0) + 1
        if (childCount[child]!! > 1) {
            return "false"
        }
    }

    return "true"
}

fun main() {
    val input =  arrayOf("(1,2)", "(3,2)", "(2,12)", "(5,2)")
    println(TreeConstructor(input)) // Output: "true"
}