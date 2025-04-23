package lotto

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

private fun getPurchaseAmount(): Int {
    println("Please enter the purchase amount.")
    val purchaseAmount = Console.readLine()
    return purchaseAmount.toInt()
}

private fun validatePurchaseAmount(purchaseAmount: Int) {
    if (purchaseAmount < 1000)
        throw IllegalArgumentException("[ERROR] The purchase amount must be 1000 or higher")
}

fun main() {
    validatePurchaseAmount(getPurchaseAmount())
}
