package lotto

import org.assertj.core.internal.Numbers

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] Lotto must contain exactly 6 numbers." }
        winningNumbersValidations(numbers)
    }

    // TODO: Implement additional functions

    private fun winningNumbersValidations(numbers: List<Int>) {
        validateNumbers(numbers)
        validateUniqueNumbers(numbers)
    }

    private fun validateNumbers(numbers: List<Int>) {
        if (numbers.any { it < 1 || it > 45 })
            throw IllegalArgumentException("[ERROR] Lotto numbers must be between 1 and 45.")
    }

    private fun validateUniqueNumbers(numbers: List<Int>) {
        if (numbers.size != numbers.distinct().size) {
            throw IllegalArgumentException("[ERROR] Lotto numbers must be unique.")
        }
    }

    fun validateBonusNumber(number: Int) {
        if (number < 1 || number > 45 )
            throw IllegalArgumentException("[ERROR] Lotto numbers must be between 1 and 45.")
    }

    fun validateBonusWinningUnique(number: Int) {
        if (number in numbers)
            throw IllegalArgumentException("[ERROR] Bonus number must be different than the winning numbers.")
    }

    fun checkMatchingNumbers(tickets: List<List<Int>>, winningNumbers: List<Int>): List<Int> {
        return tickets.map { ticket ->
            ticket.count { number -> number in winningNumbers}
        }
    }

}
