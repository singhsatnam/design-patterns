package src.java.decorator;

public class SuperCar extends NewCar
{
//    public void addOption(String optionName)
//    {
//        if(optionName.equals("sound_pack"))
//        {
//            this.car = new ActiveExhausts(car);
//        }
//        else if (optionName.equals("active_body_kit "))
//        {
//            this.car = new DynamicSpoiler(car);
//        }
//    }

    public void showPurchase()
    {
        super.showPurchase();
    }

    protected void addOption(String option) {
        return;
    }
}
