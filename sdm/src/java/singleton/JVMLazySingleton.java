package singleton;

import java.util.Random;

public class JVMLazySingleton {
    int behaviour; // Visibility
    private JVMLazySingleton()
    {
        Random rand = new Random(); // Remove
        behaviour = rand.nextInt(50); // this.behaviour
    }
    private static class StaticInnerClass {
        static final JVMLazySingleton new_instance = new JVMLazySingleton(); // NewInstance
    }
    public static JVMLazySingleton getInstance() {
        return StaticInnerClass.new_instance;
    }
}
