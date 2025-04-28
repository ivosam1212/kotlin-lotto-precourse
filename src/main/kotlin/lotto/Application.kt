package lotto

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    val purchaseAmount = inputView.getPurchaseAmount()
    val ticketNum: Int = numberOfTickets(purchaseAmount)
    outputView.displayTicketNumber(ticketNum)

    val tickets: List<List<Int>> = ticketsGenerator(ticketNum)
    outputView.displayTickets(tickets)

    val winningNumbers = inputView.getWinningNumbers()
    val lotto = Lotto(winningNumbers)
    val bonusNumber = getBonusNumber(inputView, lotto)

    val matchResults = lotto.checkMatchingNumbers(tickets, bonusNumber)
    outputView.displayWinningResults(matchResults, purchaseAmount)
}

private fun getBonusNumber(inputView: InputView, lotto: Lotto): Int {
    val bonusNumber = inputView.getBonusNumber()
    lotto.validateBonusNumber(bonusNumber)
    lotto.validateBonusWinningUnique(bonusNumber)
    return bonusNumber
}

private fun numberOfTickets(purchaseAmount: Int): Int {
    return purchaseAmount / 1000
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