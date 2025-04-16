fun combine(n: Int, k: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val combination = mutableListOf<Int>()
    backtrack(n, k, 1, combination, result)
    return result
}

fun backtrack(n: Int, k: Int, start: Int, combination: MutableList<Int>, result: MutableList<List<Int>>) {
    if (combination.size == k) {
        result.add(ArrayList(combination))
        return
    }

    for (i in start..n) {
        combination.add(i)
        backtrack(n, k, i + 1, combination, result)
        combination.removeAt(combination.size - 1)
    }
}

fun main() {
    val n = 4
    val k = 2
    val combinations = combine(n, k)
    println(combinations) // Output: [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
}