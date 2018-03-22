import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamFactory {

    public Map<String,Team> createFrom(String... qualificationsResults) {
        Map<String,Team> teams = new HashMap<String, Team>();
        for (String result : qualificationsResults) {
            String winnerTeamName = result.split(" ")[0];
            String loserTeamName = result.split(" ")[1];
            if (!teams.containsKey(winnerTeamName)) {
                Team winnerTeam = new Team(winnerTeamName);
                winnerTeam.addPoint();
                teams.put(winnerTeamName, winnerTeam);
            } else {
                Team team = teams.get(winnerTeamName);
                team.addPoint();
            }
            if (!teams.containsKey(loserTeamName)) {
                teams.put(loserTeamName, new Team(loserTeamName));
            }
        }

        return teams;
    }
}
