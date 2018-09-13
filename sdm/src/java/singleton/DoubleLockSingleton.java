package singleton;

import java.util.Random;

public class DoubleLockSingleton {
    int behaviour;
    private static DoubleLockSingleton new_singleton = null;
    private DoubleLockSingleton()
    {
        Random rand = new Random();
        behaviour = rand.nextInt(50);
    }
    public static DoubleLockSingleton getInstance()
    {
        if(new_singleton == null)
        {
            synchronized (DoubleLockSingleton.class)
            {
                if(new_singleton == null)
                {
                    new_singleton = new DoubleLockSingleton();
                }
            }
        }
        return new_singleton;
    }
}
