package src.java.association;

public class Person
{
    int count; // Dead code, use your IDE to identify and remove dead code.
    Head head; // Multiple instances rather than one instance with a count.
    Torso torso; // Same
    Limbs limbs; // Same
    Person(int headCount, int torsoCount, int limbsCount) // Why not public? Also remove the "long" list of int parameters
    {
        head = new Head(headCount);
        torso = new Torso(torsoCount);
        limbs = new Limbs(limbsCount);
    }
    void showAll()
    {
        System.out.println("New person created."); // Remove
        head.showAll();
        torso.showAll();
        limbs.showAll();
    }
}
