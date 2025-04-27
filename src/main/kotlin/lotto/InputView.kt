package lotto

import camp.nextstep.edu.missionutils.Console

class InputView {

    fun getPurchaseAmount(): Int {
        println("Please enter the purchase amount.")
        val purchaseAmount = Console.readLine().toInt()
        validatePurchaseAmount(purchaseAmount)
        return purchaseAmount
    }

    private fun validatePurchaseAmount(purchaseAmount: Int): Int {
        if (purchaseAmount < 1000)
            throw IllegalArgumentException("[ERROR] The purchase amount must be 1000 or higher")
        return purchaseAmount
    }

    fun getWinningNumbers(): List<Int> {
        println("\nPlease enter last week's winning numbers.")
        val winningNumsString = Console.readLine()
        val winningNumbers = winningNumsString.split(",").map { it.toInt() }
        return winningNumbers
    }


}