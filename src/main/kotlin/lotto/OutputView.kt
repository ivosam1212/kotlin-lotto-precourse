package lotto

class OutputView {

    fun displayTicketNumber(ticketNum: Int) {
        println("\nYou have purchased $ticketNum tickets.")
    }

    fun displayTickets(tickets: List<List<Int>>) {
        for (ticket in tickets) {
            println(ticket)
        }
    }

    fun displayWinningResults(matchResults: Map<Lotto.PrizeTier, Int>, purchaseAmount: Int) {
        println("\nWinning Statistics")
        println("---")

        Lotto.PrizeTier.values().forEach { tier ->
            val count = matchResults.getOrDefault(tier, 0)
            println(tier.getDisplayText(count))
        }
    }
}