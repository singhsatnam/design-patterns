package singleton;
import java.util.Random;

public class Singleton {
    private final int behaviour;
    private static final Singleton new_singleton = new Singleton();
    private Singleton()
    {
            Random rand = new Random();
            behaviour = rand.nextInt(50);
    }
    public static Singleton getInstance()
    {
        return new_singleton;
    }
    protected int getBehaviour()
    {
        return this.behaviour;
    }
}
