package singleton;

import java.util.Random;

public class DoubleLockSingleton {
   private final int behaviour;
    private static DoubleLockSingleton newSingleton;
    private DoubleLockSingleton()
    {
        Random rand = new Random();
        behaviour = rand.nextInt(50);
    }
    public static DoubleLockSingleton getInstance()
    {
        if(newSingleton == null)
        {
            synchronized (DoubleLockSingleton.class)
            {
                if(newSingleton == null)
                {
                    newSingleton = new DoubleLockSingleton();
                }
            }
        }
        return newSingleton;
    }
    protected int getBehaviour()
    {
        return this.behaviour;
    }
}
