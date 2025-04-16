fun FindIntersection(strArr: Array<String>): String {
    // Chuyển đổi các chuỗi thành các tập hợp số nguyên
    val set1 = strArr[0].split(", ").map { it.toInt() }.toSet()
    val set2 = strArr[1].split(", ").map { it.toInt() }.toSet()

    // Tìm giao của hai tập hợp
    val intersection = set1.intersect(set2).sorted()

    // Trả về kết quả dưới dạng chuỗi các số được phân tách bằng dấu phẩy
    return if (intersection.isEmpty()) "false" else intersection.joinToString(", ")
}

fun main() {
    val input = arrayOf("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")
    println(FindIntersection(input)) // Output: "1, 4, 13"
}