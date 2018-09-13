package iterator;

import java.util.NoSuchElementException;

public class TicketIterator implements ITicketIterator {

    int cursor;
    int totalTickets;
    TicketIterator(int cursor, int totalTickets)
    {
        this.cursor = cursor;
        this.totalTickets = totalTickets;
    }
    public boolean hasNext() {
        return this.cursor < this.totalTickets;
    }

    public Integer next() {
        if(this.hasNext()) {
            int current = cursor;
            cursor ++;
            return current;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
