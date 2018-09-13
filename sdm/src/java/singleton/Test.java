package singleton;
import static utilities.Utilities.*;
public class Test {
    public static void main(String args[])
    {
        print("Testing Simgleton.");
        test_singleton();
        print("Testing Lazy Simgleton.");
        test_lazy_singleton();
        print("Testing Double Lock Simgleton.");
        test_doube_lock_singleton();
        print("Testing Synchronized Simgleton.");
        test_synchronized_singleton();
        print("Testing JVM Simgleton.");
        test_jvm_singleton();
    }
    static private void test_singleton()
    {
        Singleton an_instance = Singleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
        an_instance = Singleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
    }

    static private void test_lazy_singleton()
    {
        LazySingleton an_instance = LazySingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
        an_instance = LazySingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
    }
    static private void test_synchronized_singleton()
    {
        SynchronizedLazySingleton an_instance = SynchronizedLazySingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
        an_instance = SynchronizedLazySingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
    }
    static private void test_doube_lock_singleton()
    {
        DoubleLockSingleton an_instance = DoubleLockSingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
        an_instance = DoubleLockSingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
    }
    static private void test_jvm_singleton()
    {
        JVMLazySingleton an_instance = JVMLazySingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
        an_instance = JVMLazySingleton.getInstance();
        print(Integer.toString(an_instance.getBehaviour()));
    }
}
