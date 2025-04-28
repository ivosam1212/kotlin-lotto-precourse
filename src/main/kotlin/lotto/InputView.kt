package lotto

import camp.nextstep.edu.missionutils.Console

class InputView {

    fun getPurchaseAmount(): Int {
        println("Please enter the purchase amount.")
        return Console.readLine().toInt()
    }

    fun getWinningNumbers(): List<Int> {
        println("\nPlease enter last week's winning numbers.")
        val winningNums = Console.readLine()
        return winningNums.split(",").map { it.toInt() }
    }

    fun getBonusNumber(): Int {
        println("\nPlease enter the bonus number.")
        return Console.readLine().toInt()
    }
}