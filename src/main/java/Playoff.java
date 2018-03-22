import java.util.List;
import java.util.Map;

public class Playoff {
    private Map<String, Team> teams;
    private List<Match> matches;

    public Playoff(String... qualificationsResults) {
        TeamParser teamParser = new TeamParser();
        MatchConverter matchConverter = new MatchConverter();
        teams = teamParser.createFrom(qualificationsResults);
        matches = matchConverter.convertFrom(teams);
    }

    public String[] layout() {
        String[] result = new String[matches.size()];
        for (int i = matches.size() - 1; i >= 0; i--) {
            result[i] = matches.get(i).layout();
        }

        return result;
    }
}
