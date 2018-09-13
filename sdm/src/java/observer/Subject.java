package observer;
public interface Subject {
    public void registerNewObserver(CustomObserver o);
    public void removeObserver(CustomObserver o);
    public void updateObservers();
}
