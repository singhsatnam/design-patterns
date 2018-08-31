package src.java.association;

import java.util.ArrayList;
import java.util.List;

public class Team
{
    List<Player> doublesTeam = new ArrayList<Player>(); // Should bot be plural, or should be "players"
    Team(Player player1, Player player2)
    {
        this.doublesTeam.add(player1); // Should check for same player added twice?
        this.doublesTeam.add(player2);
    }
    void showAll()
    {
        System.out.println("New team created:");
        for (Player player:doublesTeam)
        {
            System.out.print("\t");
            player.showAll();
        }
    }
}
