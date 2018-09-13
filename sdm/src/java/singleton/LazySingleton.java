package singleton;

import java.util.Random;

public class LazySingleton {
    int behaviour;
    private static LazySingleton new_singleton = null;
    private LazySingleton()
    {
        Random rand = new Random();
        behaviour = rand.nextInt(50);
    }
    public static LazySingleton getInstance()
    {
        if(new_singleton == null)
        {
            new_singleton = new LazySingleton();
        }
        return new_singleton;
    }
}
