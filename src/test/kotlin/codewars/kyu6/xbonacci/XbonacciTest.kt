package codewars.kyu6.xbonacci

import codewars.kyu6.xbonacci.Xbonacci.tribonacci
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class XbonacciTest {
    private val precision = 1e-10

    @Test
    fun basicTests() {
        assertArrayEquals(
            doubleArrayOf(1.0, 1.0, 1.0, 3.0, 5.0, 9.0, 17.0, 31.0, 57.0, 105.0),
            tribonacci(doubleArrayOf(1.0, 1.0, 1.0), 10),
            precision,
        )
        assertArrayEquals(
            doubleArrayOf(0.0, 0.0, 1.0, 1.0, 2.0, 4.0, 7.0, 13.0, 24.0, 44.0),
            tribonacci(doubleArrayOf(0.0, 0.0, 1.0), 10),
            precision,
        )
        assertArrayEquals(
            doubleArrayOf(0.0, 1.0, 1.0, 2.0, 4.0, 7.0, 13.0, 24.0, 44.0, 81.0),
            tribonacci(doubleArrayOf(0.0, 1.0, 1.0), 10),
            precision,
        )
        assertArrayEquals(doubleArrayOf(), tribonacci(doubleArrayOf(0.0, 1.0, 1.0), 0), precision)
    }
}
