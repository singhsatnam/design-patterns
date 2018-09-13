package decorator;

abstract class NewCar implements ICar
{
    public void showPurchase() {
        System.out.println("You have chosen these optional extras:");
    }
    protected abstract void addOption(String option);
}
