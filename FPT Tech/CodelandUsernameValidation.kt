fun CodelandUsernameValidation(str: String): String {
    // Kiểm tra độ dài của tên người dùng
    if (str.length < 4 || str.length > 25) {
        return "false"
    }

    // Kiểm tra ký tự đầu tiên phải là chữ cái
    if (!str[0].isLetter()) {
        return "false"
    }

    // Kiểm tra ký tự cuối cùng không phải là dấu gạch dưới
    if (str.last() == '_') {
        return "false"
    }

    // Kiểm tra các ký tự chỉ chứa chữ cái, số và dấu gạch dưới
    for (char in str) {
        if (!char.isLetterOrDigit() && char != '_') {
            return "false"
        }
    }

    return "true"
}

fun main() {
    // Hàm nhập để test
    while (true) {
        println("Nhập tên người dùng để kiểm tra (hoặc gõ 'exit' để thoát):")
        val input = readLine()!!
        if (input.lowercase() == "exit") break
        println("Kết quả: ${CodelandUsernameValidation(input)}")
    }
}