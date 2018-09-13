package src.java.association;

public class Limbs extends BodyPart
{
    private String name;
    Limbs(String name)
    {
        super(name);
    }
    public String getName()
    {
        return this.name;
    }
}
