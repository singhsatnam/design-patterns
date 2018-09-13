package iterator;

import java.util.Iterator;

public interface ITicketIterator extends Iterator<Integer> // Is this class really necessary?
{
    boolean hasNext();

    Integer next();

}
