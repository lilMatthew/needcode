fun LongestWord(sen: String): String {

    var words = sen.split(Regex("[^a-zA-Z0-9]+")) 
    var longestWord = ""
    for(word in words){
        if(word.length > longestWord.length){
            longestWord = word
        }
    }
    return longestWord;
    
  }
  
  fun main() {
    println("Enter a string: ")
    var input = readLine()!!
    println(LongestWord(input))
  }