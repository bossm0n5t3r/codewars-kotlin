package codewars.kyu6.morsecode

import codewars.utils.Constants.MorseCode

object DecodeTheMorseCode {
    fun decodeMorse(code: String): String =
        code
            .trim()
            .split("   ")
            .joinToString(" ") {
                it.split(" ").joinToString("") { morseCode ->
                    MorseCode[morseCode] ?: ""
                }
            }
}
