package singleton;

import java.util.Random;

public class DoubleLockSingleton {
    int behaviour; // Private and final?
    private static DoubleLockSingleton new_singleton = null; // NewSingleton
    private DoubleLockSingleton()
    {
        Random rand = new Random(); // rand is unnecessary
        behaviour = rand.nextInt(50); // this.behaviour
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
