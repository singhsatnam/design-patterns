package observer;

public class TestObserver {
    public static void main(String args[])
    {
        //Creating an observable subject
        SlackGroup ptidej = new SlackGroup("Ptidej");

        //Lets create some observers
        TeamMate person1 = new TeamMate("Batman");
        TeamMate person2 = new TeamMate("Aprien");
        TeamMate person3 = new TeamMate("Kann");

        ptidej.registerNewObserver(person1);
        ptidej.registerNewObserver(person2);
        ptidej.registerNewObserver(person3);

        ptidej.setMessage("Team meeting next Tuesday @ 1pm");

    }

}
