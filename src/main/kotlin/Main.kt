import java.math.BigInteger

//fun main(){
    fun main() {
        val fibonacci = 100
        val fibonacciNumbers = fibonacciNumbers(fibonacci)

        println("First $fibonacci Fibonacci numbers:")
        fibonacciNumbers.forEachIndexed { index, number ->
            println("$index: $number")
        }
    }

    fun fibonacciNumbers(fibonacci: Int): List<BigInteger> {
        val fibonacciNumbers = mutableListOf<BigInteger>()

        var a = BigInteger.ZERO
        var b = BigInteger.ONE

        repeat(fibonacci) {
            fibonacciNumbers.add(a)
            val nextNumber = a + b
            a = b
            b = nextNumber
        }

        return fibonacciNumbers
    }




