package lotto

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

fun getPurchaseAmount(): Int {
    println("Please enter the purchase amount.")
    val purchaseAmount = Console.readLine()
    return purchaseAmount.toInt()
}

fun main() {
    getPurchaseAmount()
}
