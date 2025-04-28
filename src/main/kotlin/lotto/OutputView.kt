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
}