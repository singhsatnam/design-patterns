package src.java.association;


import static src.java.utilities.Utilities.print;

abstract class BodyPart
{
    private String name = null;
    BodyPart(String name)
    {
        print(name + "received");
        this.name = name;
    }
    private String getName()
    {
        print(this.name);
        return this.name;
    }

}
