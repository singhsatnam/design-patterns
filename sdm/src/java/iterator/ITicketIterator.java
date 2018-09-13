package iterator;
import java.util.Iterator;

public interface ITicketIterator extends Iterator<Integer>
{
    boolean hasNext();

    Integer next();

}
