package src.java.association;

public class Limbs {
    int count;
    Limbs(int count)
    {
        this.count = count;
    }
    void showAll() // Talking about a common superclass, the show/showAll method should be declared in the superclass so that an algorithm can print information without having to know with which body part it is dealing. 
    {
        System.out.println("Limbs count: " + count);
    }
}
