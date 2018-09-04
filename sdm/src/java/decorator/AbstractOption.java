package src.java.decorator;

abstract class AbstractOption implements ICar{
    protected ICar car;

    public AbstractOption(ICar car)
    {
        this.car = car;
    }
    public void showPurchase()
    {
        car.showPurchase();
    }
}
