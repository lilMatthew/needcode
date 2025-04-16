fun FirstReverseAndShift(str: String): String {
    // Đảo ngược chuỗi
    val reversedStr = str.reversed()

    // Thay đổi mỗi chữ cái thành chữ cái phía sau nó trong bảng chữ cái
    val shiftedStr = reversedStr.map { char ->
        when (char) {
            in 'a'..'y' -> char + 1
            'z' -> 'a'
            in 'A'..'Y' -> char + 1
            'Z' -> 'A'
            else -> char
        }
    }.joinToString("")

    return shiftedStr
}

fun main() {
    // Chuỗi mẫu để debug
    val sampleString = "coderbyte"
    println("Reversed and Shifted String: ${FirstReverseAndShift(sampleString)}")
    
    // Đọc chuỗi từ đầu vào người dùng
    println("Enter a string to reverse and shift:")
    val inputString = readLine()!!
    println("Reversed and Shifted Input String: ${FirstReverseAndShift(inputString)}")
}