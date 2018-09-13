package decorator;

import static utilities.Utilities.print;

public class ActiveExhausts extends AbstractOption
{

    public ActiveExhausts(ICar car) {
        super(car);
    }

    public void showPurchase()
    {
        super.showPurchase();
        print("Active Exhausts");
    }
}
