import java.util.List;
import java.util.Map;

public class Playoff {
    private Map<String, Team> teams;
    private List<Match> matches;

    public Playoff(String... qualificationsResults) {
        TeamParser teamParser = new TeamParser();
        MatchFactory matchFactory = new MatchFactory();
        teams = teamParser.createFrom(qualificationsResults);
        matches = matchFactory.createFrom(teams);
    }

    public String[] layout() {
        String[] result = new String[matches.size()];
        for (int i = matches.size() - 1; i >= 0; i--) {
            result[i] = matches.get(i).layout();
        }

        return result;
    }
}
