package src.java.decorator;

public class Car extends AbstractCar // What is the difference between AbstractCar and ICar?
{

    String getDecoratorName() {
        return null; // This should not exist, else NullPointerException!
    }

    int getCost() {
        return 0;
    }
}
