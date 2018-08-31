package src.java.decorator;

public interface ICar { // Somehow, ICar should use OptionalExtra to allow the decoration of any car
    ICar addOption();
    void showCar();
}
