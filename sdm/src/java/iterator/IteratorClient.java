package iterator;

import java.util.Iterator;

public class IteratorClient
{
    public static void main(String[] args) {
        Ticket ticket = new Ticket(1, 4);
        Iterator<Integer> it = ticket.iterator();
        while(it.hasNext()) {
            int cur = it.next();
            System.out.println(cur);
        }
    }
}
