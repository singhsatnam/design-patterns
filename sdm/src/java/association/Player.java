package src.java.association;

public class Player // Should be subclass of Person
{
    String name, country; // Visibility
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
