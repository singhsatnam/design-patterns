package association;

public class Player
{
    String name, country;
    Player(String name, String country)
    {
        this.name = name;
        this.country = country;
    }
    void showAll()
    {
        System.out.println(this.name + " plays for " + this.country);
    }
}
