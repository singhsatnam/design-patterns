package src.java.decorator;

public class TestPurchase
{
    public static void main(String args[])
    {
        SuperCar superCar = new SuperCar();
        superCar.makeNewPurchase("sound_pack"); // Meaning of this method on ICar?
        superCar.showPurchase();
        superCar.makeNewPurchase("active_body_kit ");
        superCar.showPurchase();
    }
}
