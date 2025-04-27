package lotto

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

private fun getPurchaseAmount(): Int {
    println("Please enter the purchase amount.")
    val purchaseAmount = Console.readLine()
    return purchaseAmount.toInt()
}

private fun validatePurchaseAmount(purchaseAmount: Int): Int {
    if (purchaseAmount < 1000)
        throw IllegalArgumentException("[ERROR] The purchase amount must be 1000 or higher")
    return purchaseAmount
}

private fun numberOfTickets(purchaseAmount: Int): Int {
    val ticketNumb: Int = purchaseAmount / 1000
    println("\nYou have purchased $ticketNumb tickets.")
    return ticketNumb
}

private fun singleTicketGenerator(): List<Int> {
    val numbers = mutableListOf<Int>()

    while (numbers.size < 6) {
        val randomNumber = Randoms.pickNumberInRange(1, 45)
        if (!numbers.contains(randomNumber))
            numbers.add(randomNumber)
    }
    return numbers
}

fun ticketsGenerator(ticketNum: Int): List<List<Int>> {
    val tickets = mutableListOf<List<Int>>()

    repeat (ticketNum) {
        val ticket =  singleTicketGenerator()
        tickets.add(ticket)
    }
    return tickets
}

private fun displayTickets(tickets: List<List<Int>>) {
    for (ticket in tickets) {
        println(ticket)
    }
}

fun getWinningNumbers(): List<Int> {
    println("\nPlease enter last week's winning numbers.")
    val winningNumsString = Console.readLine()
    val winningNumbers = winningNumsString.split(",").map { it.toInt() }
    return winningNumbers
}

fun main() {
    val purchaseAmount: Int = validatePurchaseAmount(getPurchaseAmount())
    val ticketNum: Int = numberOfTickets(purchaseAmount)
    val tickets: List<List<Int>> = ticketsGenerator(ticketNum)
    displayTickets(tickets)

    Lotto(getWinningNumbers())
}
