package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Ticket implements Iterable<Integer>
{
    int ticketId;
    int totalTickets;
    Ticket(int newTicket, int count)
    {
        this.ticketId = newTicket;
        this.totalTickets = count;
    }
    public Iterator<Integer> iterator()
    {
        return new TicketIterator(0, totalTickets); // Not here!
    }
}
