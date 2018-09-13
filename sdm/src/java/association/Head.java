package src.java.association;

class Head extends BodyPart
{
    Head(String name)
    {
        super(name);
    }
    public String getName()
    {
        return super.getClass().getName();
    }
}
