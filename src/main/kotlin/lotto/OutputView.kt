package lotto

class OutputView {

    fun numberOfTickets(purchaseAmount: Int): Int {
        val ticketNumb: Int = purchaseAmount / 1000
        println("\nYou have purchased $ticketNumb tickets.")
        return ticketNumb
    }

    fun displayTickets(tickets: List<List<Int>>) {
        for (ticket in tickets) {
            println(ticket)
        }
    }
}