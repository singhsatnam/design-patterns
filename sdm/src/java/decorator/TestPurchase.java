package src.java.decorator;

public class TestPurchase
{
    public static void main(String args[])
    {
        ICar superCar = new ActiveExhausts(new DynamicSpoiler(new SuperCar()));
        superCar.showPurchase();
//        superCar.addOption("sound_pack");
//        superCar.showPurchase();
//        superCar.addOption("active_body_kit ");
//        superCar.showPurchase();

    }
}
