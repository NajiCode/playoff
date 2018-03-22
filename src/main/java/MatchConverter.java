import java.util.*;

public class MatchConverter {
    public List<Match> convertFrom(Map<String, Team> teamsMap) {
        List<Team> teams = new ArrayList<Team>(teamsMap.values());
        Collections.sort(teams);
        int teamsSize = teams.size();
        Team firstStrongest = teams.get(teamsSize - 1);
        Team secondStrongest = teams.get(teamsSize - 2);
        Team firstWeakest = teams.get(teamsSize - 4);
        Team secondWeakest = teams.get(teamsSize - 3);

        List<Match> matches = new ArrayList<Match>();
        matches.add(new Match(firstStrongest, firstWeakest));
        matches.add(new Match(secondStrongest,secondWeakest));
        return matches;
    }
}
