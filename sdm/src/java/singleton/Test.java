package singleton;
import static src.java.utilities.Utilities.*;
public class Test {
    public static void main(String args[])
    {
        test_singleton();
        test_lazy_singleton();
        test_doube_lock_singleton();
        test_synchronized_singleton();
        test_jvm_singleton();
    }
    static private void test_singleton()
    {
        Singleton an_instance = Singleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
        an_instance = Singleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
    }

    static private void test_lazy_singleton()
    {
        LazySingleton an_instance = LazySingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
        an_instance = LazySingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
    }
    static private void test_synchronized_singleton()
    {
        SynchronizedLazySingleton an_instance = SynchronizedLazySingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
        an_instance = SynchronizedLazySingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
    }
    static private void test_doube_lock_singleton()
    {
        DoubleLockSingleton an_instance = DoubleLockSingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
        an_instance = DoubleLockSingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
    }
    static private void test_jvm_singleton()
    {
        JVMLazySingleton an_instance = JVMLazySingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
        an_instance = JVMLazySingleton.getInstance();
        print(Integer.toString(an_instance.behaviour));
    }
}
