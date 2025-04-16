fun MinWindowSubstring(strArr: Array<String>): String {
    val N = strArr[0]
    val K = strArr[1]

    val charCountK = IntArray(128)
    for (char in K) {
        charCountK[char.code]++
    }

    var left = 0
    var right = 0
    var minLength = Int.MAX_VALUE
    var minStart = 0
    var count = K.length

    while (right < N.length) {
        if (charCountK[N[right].code] > 0) {
            count--
        }
        charCountK[N[right].code]--
        right++

        while (count == 0) {
            if (right - left < minLength) {
                minLength = right - left
                minStart = left
            }
            charCountK[N[left].code]++
            if (charCountK[N[left].code] > 0) {
                count++
            }
            left++
        }
    }

    return if (minLength == Int.MAX_VALUE) "" else N.substring(minStart, minStart + minLength)
}

fun main() {
    val input = arrayOf("ahffaksfajeeubsne", "jefaa")
    println(MinWindowSubstring(input)) 
}