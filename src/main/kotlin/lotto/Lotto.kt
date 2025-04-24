package lotto

import org.assertj.core.internal.Numbers

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] Lotto must contain exactly 6 numbers." }
        winningNumbersValidations(numbers)
    }

    // TODO: Implement additional functions

    fun winningNumbersValidations(numbers: List<Int>) {
        validateNumbers(numbers)
        validateUniqueNumbers(numbers)
    }

    fun validateNumbers(numbers: List<Int>) {
        if (numbers.any { it < 1 || it > 45 })
            throw IllegalArgumentException("[ERROR] Lotto numbers must be between 1 and 45.")
    }

    fun validateUniqueNumbers(numbers: List<Int>) {
        if (numbers.size != numbers.distinct().size) {
            throw IllegalArgumentException("[ERROR] Lotto numbers must be unique.")
        }
    }


}
