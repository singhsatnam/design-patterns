package singleton;
import java.util.Random;

public class Singleton {
    int behaviour; // Visibility
    private static final Singleton new_singleton = new Singleton(); // NewSingleton or UniqueInstance
    private Singleton()
    {
            Random rand = new Random(); // Remove
            behaviour = rand.nextInt(50); // this.behaviour
    } 
    public static Singleton getInstance()
    {
        return new_singleton;
    }
}
