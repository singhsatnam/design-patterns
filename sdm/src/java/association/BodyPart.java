package association;


import static utilities.Utilities.print;

abstract class BodyPart
{
    private String name = null;
    BodyPart(String name)
    {
        print(name + "received");
        this.name = name;
    }
    protected String getName()
    {
        print(this.name);
        return this.name;
    }

}
