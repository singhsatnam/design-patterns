package src.java.iterator;

import java.util.Iterator;

public interface ITicketIterator extends Iterator<Integer> // Is this interface really necessary? In any case you could keep it though!
{
    boolean hasNext();

    Integer next();

}
