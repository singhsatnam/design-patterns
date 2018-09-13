package observer;

import java.util.ArrayList;
import java.util.List;

public class SlackGroup implements Subject {
    private List<CustomObserver> observerList = new ArrayList<CustomObserver>();
    private String groupName;
    private String message;

    SlackGroup(String groupName)
    {
        this.groupName = groupName;
    }
    public void setMessage(String message)
    {
        this.message = message;
        updateObservers();
    }
    public void registerNewObserver(CustomObserver newObserver)
    {
        observerList.add(newObserver);
    }

    public void removeObserver(CustomObserver observer)
    {
        observerList.remove(observer);
    }
    public void updateObservers()
    {
        for(CustomObserver o:observerList)
        {
            o.update(this.groupName, this.message);
        }
    }
}
