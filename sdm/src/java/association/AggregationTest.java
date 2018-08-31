package src.java.association;

public class AggregationTest
{
    public static void main(String args[])
    {
        Player fed = new Player("Roger Federer", "Switzerland");
        Player jo = new Player("Jo-Wilfried Tsonga", "France");
        Team team = new Team(fed, jo);
        team.showAll();
        team = null;
        System.out.println("Team deleted.\n");
        fed.showAll(); // Why not show()?
        jo.showAll();
    }
}
