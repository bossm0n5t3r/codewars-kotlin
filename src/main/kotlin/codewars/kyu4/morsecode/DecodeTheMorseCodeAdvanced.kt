package codewars.kyu4.morsecode

import codewars.utils.Constants.MORSE_CODE

object DecodeTheMorseCodeAdvanced {
    fun decodeBits(bits: String): String {
        val bis = bits.trim('0')
        val timeUnit = Regex("0+|1+").findAll(bis).minOf { it.value.length }
        return bis
            .replace("111".repeat(timeUnit), "-")
            .replace("000".repeat(timeUnit), " ")
            .replace("1".repeat(timeUnit), ".")
            .replace("0".repeat(timeUnit), "")
    }

    fun decodeMorse(code: String) = code.split(" ").joinToString("") { MORSE_CODE[it] ?: " " }
}
