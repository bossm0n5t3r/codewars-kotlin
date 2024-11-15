package codewars.kyu6.morsecode

import kotlin.test.Test
import kotlin.test.assertEquals

class DecodeTheMorseCodeTest {
    private val sut = DecodeTheMorseCode()

    @Test
    fun exampleTestCases() {
        assertEquals("HEY JUDE", sut.decodeMorse(".... . -.--   .--- ..- -.. ."))
    }
}
