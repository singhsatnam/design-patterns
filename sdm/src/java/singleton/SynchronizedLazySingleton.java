package singleton;

import java.util.Random;

public class SynchronizedLazySingleton {
    int behaviour;
    private SynchronizedLazySingleton()
    {
        Random rand = new Random();
        behaviour = rand.nextInt(50);
    }
    private static SynchronizedLazySingleton new_singleton = null;
    public static SynchronizedLazySingleton getInstance()
    {
        if(new_singleton == null)
        {
            synchronized (LazySingleton.class)
            {
                new_singleton = new SynchronizedLazySingleton();
            }
        }
        return new_singleton;
    }
}
