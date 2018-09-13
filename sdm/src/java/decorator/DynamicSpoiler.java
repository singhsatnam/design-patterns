package decorator;

import static utilities.Utilities.print;

public class DynamicSpoiler extends AbstractOption
{

    public DynamicSpoiler(ICar car) {
        super(car);
    }
    public void showPurchase() {
        super.showPurchase();
        print("Dynamic Spoilers");
    }
}
