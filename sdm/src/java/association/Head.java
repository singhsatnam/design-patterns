package src.java.association;

public class Head
{
    int count; // Must be private and final, see also my comments below.
    Head(int count)
    {
        this.count = count;
    }
    void showAll()
    {
        System.out.println("Head count: " + count);
    }
}
