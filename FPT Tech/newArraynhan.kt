fun ArrayChallenge(arr: Array<Int>): IntArray {
    val n = arr.size
    val leftProducts = IntArray(n) { 1 }
    val rightProducts = IntArray(n) { 1 }
    val result = IntArray(n)

    // Tính tích của các phần tử bên trái
    for (i in 1 until n) {
        leftProducts[i] = leftProducts[i - 1] * arr[i - 1]
    }

    // Tính tích của các phần tử bên phải
    for (i in n - 2 downTo 0) {
        rightProducts[i] = rightProducts[i + 1] * arr[i + 1]
    }

    // Tính tích của các phần tử bên trái và bên phải cho mỗi phần tử
    for (i in 0 until n) {
        result[i] = leftProducts[i] * rightProducts[i]
    }

    return result
}

fun main() {
    val input = arrayOf(1, 2, 3, 4, 5)
    println(ArrayChallenge(input).joinToString(", ")) // Output: 120, 60, 40, 30, 24
}