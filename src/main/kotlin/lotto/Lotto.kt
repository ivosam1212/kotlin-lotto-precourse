package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] Lotto must contain exactly 6 numbers." }
        validateNumbers(numbers)
    }

    // TODO: Implement additional functions
    fun validateNumbers(numbers: List<Int>) {
        for (number in numbers) {
            if ((number < 1 || number > 45))
                throw IllegalArgumentException("[ERROR] Lotto numbers must be between 1 and 45.")
        }
    }
}
