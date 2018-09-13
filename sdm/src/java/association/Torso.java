package association;

public class Torso extends BodyPart
{
    private String name;
    Torso(String name)
    {
        super(name);
    }
    public String getName()
    {
        return this.name;
    }
}
