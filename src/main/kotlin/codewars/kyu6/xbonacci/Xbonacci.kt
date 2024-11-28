package codewars.kyu6.xbonacci

object Xbonacci {
    fun tribonacci(
        signature: DoubleArray,
        n: Int,
    ): DoubleArray {
        val sequence =
            sequence<Double> {
                var first = signature[0]
                var second = signature[1]
                var third = signature[2]
                while (true) {
                    yield(first)
                    val next = first + second + third
                    first = second
                    second = third
                    third = next
                }
            }
        return sequence.take(n).toList().toDoubleArray()
    }
}
