package src.java.association;
import static src.java.utilities.Utilities.print;
public class CompositionTest
{
    public static void main(String args[])
    {
        Person person = new Person();
        print("" + person.getHeadCount());
        person.addHead(2);
        print("" + person.getHeadCount());
        person.displayAllBodyParts();
        person.displayHeadList();
    }
}
