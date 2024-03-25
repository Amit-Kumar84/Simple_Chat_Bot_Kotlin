import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // Your input goes here
    val n = scanner.nextInt()

    // Call your function here
    generateSequence(n)
}

// Define your function that generates the sequence of numbers
fun generateSequence(n: Int) {
    // You need to iterate from 1 to n
    for(i in 0 until n){
        // According to the problem, each number in the sequence should be double its index plus 1
        val number = i * 2 + 1
        print("$number ")
        // Output each number followed by a space but do not print a newline


    }
    // Print a newline after the sequence
    println()
}
