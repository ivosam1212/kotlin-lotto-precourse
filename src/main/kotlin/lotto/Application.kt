package lotto

import camp.nextstep.edu.missionutils.Randoms

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

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    val purchaseAmount = inputView.getPurchaseAmount()
    val ticketNum: Int = outputView.numberOfTickets(purchaseAmount)
    val tickets: List<List<Int>> = ticketsGenerator(ticketNum)
    outputView.displayTickets(tickets)

    Lotto(inputView.getWinningNumbers())
}
