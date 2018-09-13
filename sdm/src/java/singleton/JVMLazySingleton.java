package singleton;

import java.util.Random;

public class JVMLazySingleton {
    int behaviour;
    private JVMLazySingleton()
    {
        Random rand = new Random();
        behaviour = rand.nextInt(50);
    }
    private static class StaticInnerClass {
        static final JVMLazySingleton new_instance = new JVMLazySingleton();
    }
    public static JVMLazySingleton getInstance() {
        return StaticInnerClass.new_instance;
    }
}
