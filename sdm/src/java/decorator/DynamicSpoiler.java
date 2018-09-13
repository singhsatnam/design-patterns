package decorator;

import static src.java.utilities.Utilities.print;

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
