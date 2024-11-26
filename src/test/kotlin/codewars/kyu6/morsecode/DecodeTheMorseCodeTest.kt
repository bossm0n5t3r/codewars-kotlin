package codewars.kyu6.morsecode

import codewars.kyu6.morsecode.DecodeTheMorseCode.decodeMorse
import kotlin.test.Test
import kotlin.test.assertEquals

class DecodeTheMorseCodeTest {
    @Test
    fun exampleTestCases() {
        assertEquals("HEY JUDE", decodeMorse(".... . -.--   .--- ..- -.. ."))
    }
}
