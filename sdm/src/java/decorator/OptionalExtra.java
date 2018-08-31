package src.java.decorator;

public abstract class OptionalExtra implements ICar // Is an OptionalExtra really a ICar?
{
    ICar newPurchase; // Why "newPurchase"? Why not "decoratedCar"?
    public OptionalExtra(ICar aCar)
    {
        this.newPurchase = aCar;
    }

    public ICar addOption()
    {
        return this;
    }
    public void showCar()
    {
        newPurchase.showCar();
    }
}
