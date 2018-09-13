package singleton;

import java.util.Random;

public class JVMLazySingleton {
    private final int behaviour;
    private JVMLazySingleton()
    {
        Random rand = new Random();
        this.behaviour = rand.nextInt(50);
    }
    private static class StaticInnerClass {
        static final JVMLazySingleton newInstance = new JVMLazySingleton();
    }
    public static JVMLazySingleton getInstance() {
        return StaticInnerClass.newInstance;
    }
    protected int getBehaviour()
    {
        return this.behaviour;
    }
}
