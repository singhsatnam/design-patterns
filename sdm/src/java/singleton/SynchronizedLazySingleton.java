package singleton;

import java.util.Random;

public class SynchronizedLazySingleton { // This is the same as one of the first ones...
    int behaviour; // Visbility
    private SynchronizedLazySingleton()
    {
        Random rand = new Random();
        behaviour = rand.nextInt(50);
    }
    private static SynchronizedLazySingleton new_singleton = null;
    public static synchronized SynchronizedLazySingleton getInstance() // This is slow but works!
    {
        if(new_singleton == null)
        {
            new_singleton = new SynchronizedLazySingleton();
        }
        return new_singleton;
    }
}
