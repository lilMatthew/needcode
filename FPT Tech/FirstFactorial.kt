fun FirstFactorial(num: Int): Int {
   var result = 1
   if(num == 0 || num ==1 ) return 1
   for (i in 1..num){
    result *= i
   }
   return result
}

fun main() {
    println("Enter a number:")
    val input = readLine()!!.toInt()
    println(FirstFactorial(input))
}