package observer;

import java.util.Observable;

import static utilities.Utilities.print;

public class TeamMate implements CustomObserver {

    private String memberName;
    TeamMate(String newMember)
    {
        this.memberName = newMember;
    }
    public void update(String groupName, String message) {
        print("From " + groupName + ": Hey " + this.memberName + ",\n" + message);
    }
}
